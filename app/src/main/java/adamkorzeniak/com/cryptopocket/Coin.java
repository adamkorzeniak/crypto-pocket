package adamkorzeniak.com.cryptopocket;

class Coin {

    private Integer id;
    private String name;
    private String symbol;
    private String coinCapId;
    private String coinCalendarId;

    public Coin() {}

    public Coin(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCoinCapId() {
        return coinCapId;
    }

    public void setCoinCapId(String coinCapId) {
        this.coinCapId = coinCapId;
    }

    public String getCoinCalendarId() {
        return coinCalendarId;
    }

    public void setCoinCalendarId(String coinCalendarId) {
        this.coinCalendarId = coinCalendarId;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    private boolean isFavorite;
}
