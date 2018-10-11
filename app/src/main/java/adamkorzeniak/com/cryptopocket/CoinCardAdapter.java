package adamkorzeniak.com.cryptopocket;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CoinCardAdapter extends RecyclerView.Adapter<CoinCardAdapter.ViewHolder> {

    private String[] names;
    private String[] symbols;
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

    public CoinCardAdapter(String[] names, String[] symbols) {
        this.names = names;
        this.symbols = symbols;
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    public CoinCardAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coin_element, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        TextView nameLabel = (TextView) cardView.findViewById(R.id.name_label);
        nameLabel.setText(names[position]);
        TextView symbolLabel = (TextView) cardView.findViewById(R.id.symbol_label);
        symbolLabel.setText(symbols[position]);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }
}

