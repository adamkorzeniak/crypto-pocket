package adamkorzeniak.com.cryptopocket;

import java.time.LocalDate;
import java.util.Date;

public class Event {

    private String coinName;
    private String coinSymbol;
    private String title;
    private Date date;
    private String description;

    public Event(String coinName, String coinSymbol, String title, Date date, String description) {
        this.coinName = coinName;
        this.coinSymbol = coinSymbol;
        this.title = title;
        this.date = date;
        this.description = description;
    }


    public String getCoinName() {
        return coinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
