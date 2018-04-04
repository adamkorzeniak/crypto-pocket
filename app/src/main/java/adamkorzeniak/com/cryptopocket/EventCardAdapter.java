package adamkorzeniak.com.cryptopocket;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EventCardAdapter extends RecyclerView.Adapter<EventCardAdapter.ViewHolder> {

    private Event[] events;

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

    public EventCardAdapter(Event[] events) {
        this.events = events;
    }

    @Override
    public int getItemCount() {
        return events.length;
    }

    @Override
    public EventCardAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_element, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        TextView coinLabel = (TextView) cardView.findViewById(R.id.coin_event);
        coinLabel.setText(events[position].getCoinName() + " (" + events[position].getCoinSymbol() + ")");
        TextView titleLabel = (TextView) cardView.findViewById(R.id.event_title);
        titleLabel.setText(events[position].getTitle());
        TextView dateLabel = (TextView) cardView.findViewById(R.id.event_date);
        dateLabel.setText(events[position].getDate().toString());
        TextView descriptionLabel = (TextView) cardView.findViewById(R.id.event_description);
        descriptionLabel.setText(events[position].getDescription());
    }
}

