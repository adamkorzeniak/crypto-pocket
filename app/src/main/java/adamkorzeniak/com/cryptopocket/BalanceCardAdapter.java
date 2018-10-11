package adamkorzeniak.com.cryptopocket;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BalanceCardAdapter extends RecyclerView.Adapter<BalanceCardAdapter.ViewHolder> {

    private String[] names;
    private String[] symbols;
    private Double[] prices;
    private Double[] balances;
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    public BalanceCardAdapter(String[] names, String[] symbols, Double[] prices, Double[] balances) {
        this.names = names;
        this.symbols = symbols;
        this.prices = prices;
        this.balances = balances;
    }

    @Override
    public int getItemCount() {
        return names.length + 2;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public BalanceCardAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.balance_element, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;

        TextView nameLabel = (TextView) cardView.findViewById(R.id.coin_name_label);
        TextView symbolLabel = (TextView) cardView.findViewById(R.id.coin_symbol_label);
        TextView priceLabel = (TextView) cardView.findViewById(R.id.coin_price_label);
        TextView balanceLabel = (TextView) cardView.findViewById(R.id.coin_balance_label);
        TextView pricesLabel = (TextView) cardView.findViewById(R.id.coin_value_label);

        if (position == 0) {
            nameLabel.setText("Name");
            symbolLabel.setText("Symbol");
            priceLabel.setText("Price");
            balanceLabel.setText("Balance");
            pricesLabel.setText("Value USD");

        } else if (position - 1 < names.length ) {
            nameLabel.setText(names[position - 1]);
            symbolLabel.setText(symbols[position - 1]);
            priceLabel.setText(prices[position - 1].toString());
            balanceLabel.setText(balances[position - 1].toString());
            Double value = (prices[position - 1] * balances[position - 1]);
            pricesLabel.setText(value.toString());
        } else {

            nameLabel.setText("Summary");
            symbolLabel.setText("");
            priceLabel.setText("");
            balanceLabel.setText("");

            Double value = new Double(0);

            for (int i = 0; i < names.length; i++) {
                value += prices[i] * balances[i];
            }

            pricesLabel.setText(value.toString());
        }

    }
}

