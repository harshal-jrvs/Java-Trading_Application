package ca.jrvs.apps.model.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "askPrice",
        "askSize",
        "bidPrice",
        "bidSize",
        "id",
        "lastPrice",
        "ticker"
})
public class Quote implements Entity<String> {

    @JsonProperty("askPrice")
    private Double askPrice;
    @JsonProperty("askSize")
    private Integer askSize;
    @JsonProperty("bidPrice")
    private Double bidPrice;
    @JsonProperty("bidSize")
    private Integer bidSize;
    @JsonProperty("id")
    private String id;
    @JsonProperty("lastPrice")
    private Double lastPrice;
    @JsonProperty("ticker")
    private String ticker;

    @JsonProperty("askPrice")
    public Double getAskPrice() {
        return askPrice;
    }

    @JsonProperty("askPrice")
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    @JsonProperty("askSize")
    public Integer getAskSize() {
        return askSize;
    }

    @JsonProperty("askSize")
    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    @JsonProperty("bidPrice")
    public Double getBidPrice() {
        return bidPrice;
    }

    @JsonProperty("bidPrice")
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    @JsonProperty("bidSize")
    public Integer getBidSize() {
        return bidSize;
    }

    @JsonProperty("bidSize")
    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("lastPrice")
    public Double getLastPrice() {
        return lastPrice;
    }

    @JsonProperty("lastPrice")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }

    @JsonProperty("ticker")
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("askPrice", askPrice)
                .append("askSize", askSize)
                .append("bidPrice", bidPrice)
                .append("bidSize", bidSize)
                .append("id", id)
                .append("lastPrice", lastPrice)
                .append("ticker", ticker)
                .toString();
    }
}