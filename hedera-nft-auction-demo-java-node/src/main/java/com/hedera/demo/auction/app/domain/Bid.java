/*
 * This file is generated by jOOQ.
 */
package com.hedera.demo.auction.app.domain;


import com.hedera.demo.auction.app.db.Tables;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.Row;
import org.jooq.Record;

import java.io.Serializable;

/**
 * Domain definition for database interactions in the context of bids
 */
public class Bid implements VertxPojo, Serializable {

    public static final String HIGHER_BID = "Higher bid received";
    public static final String AUCTION_CLOSED = "Auction is closed";
    public static final String AUCTION_NOT_STARTED = "Auction has not started yet";
    public static final String WINNER_CANT_BID = "Winner can't bid again";
    public static final String INCREASE_TOO_SMALL = "Bid increase too small";
    public static final String BELOW_RESERVE = "Bid below reserve";
    public static final String UNDER_BID = "Under bid";

    public static final String REFUND_PENDING = "PENDING";
    public static final String REFUND_ISSUED = "ISSUED";
    public static final String REFUND_ISSUING = "ISSUING";
    public static final String REFUND_REFUNDED = "REFUNDED";
    public static final String REFUND_ERROR = "ERROR";
    public static final String REFUND_MEMO_PREFIX = "Auction refund for tx ";

    private static final long serialVersionUID = -286838882;

    private String timestamp = "";
    private Integer auctionid = 0;
    private String bidderaccountid = "";
    private Long bidamount = 0L;
    private String status = "";
    private String refundtxid = "";
    private String refundtxhash = "";
    private String transactionid = "";
    private String transactionhash = "";
    private String refundstatus = "";
    private String scheduleId = "";

    public Bid() {}

    /**
     * Constructor from a database Row
     * @param row Row from the database
     */
    public Bid(Row row) {
        this.auctionid = row.getInteger(Tables.BIDS.AUCTIONID.getName());
        this.bidamount = row.getLong(Tables.BIDS.BIDAMOUNT.getName());
        this.bidderaccountid = row.getString(Tables.BIDS.BIDDERACCOUNTID.getName());
        this.refundtxid = row.getString(Tables.BIDS.REFUNDTXID.getName());
        this.refundtxhash = row.getString(Tables.BIDS.REFUNDTXHASH.getName());
        this.transactionid = row.getString(Tables.BIDS.TRANSACTIONID.getName());
        this.status = row.getString(Tables.BIDS.STATUS.getName());
        this.timestamp = row.getString(Tables.BIDS.TIMESTAMP.getName());
        this.transactionhash = row.getString(Tables.BIDS.TRANSACTIONHASH.getName());
        this.refundstatus = row.getString(Tables.BIDS.REFUNDSTATUS.getName());
        this.scheduleId = row.getString(Tables.BIDS.SCHEDULEID.getName());
    }

    /**
     * Constructor from a Record
     * @param record Record from the database
     */
    public Bid(Record record) {
        this.auctionid = record.get(Tables.BIDS.AUCTIONID);
        this.bidamount = record.get(Tables.BIDS.BIDAMOUNT);
        this.bidderaccountid = record.get(Tables.BIDS.BIDDERACCOUNTID);
        this.refundtxid = record.get(Tables.BIDS.REFUNDTXID);
        this.refundtxhash = record.get(Tables.BIDS.REFUNDTXHASH);
        this.transactionid = record.get(Tables.BIDS.TRANSACTIONID);
        this.status = record.get(Tables.BIDS.STATUS);
        this.timestamp = record.get(Tables.BIDS.TIMESTAMP);
        this.transactionhash = record.get(Tables.BIDS.TRANSACTIONHASH);
        this.refundstatus = record.get(Tables.BIDS.REFUNDSTATUS);
        this.scheduleId = record.get(Tables.BIDS.SCHEDULEID);
    }

    /**
     * Constructor from json
     * @param json the json to construct from
     */
    public Bid(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getAuctionid() {
        return this.auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public String getBidderaccountid() {
        return this.bidderaccountid;
    }

    public void setBidderaccountid(String bidderaccountid) {
        this.bidderaccountid = bidderaccountid;
    }

    public Long getBidamount() {
        return this.bidamount;
    }

    public void setBidamount(Long bidamount) {
        this.bidamount = bidamount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRefundtxid() {
        return this.refundtxid;
    }

    public void setRefundtxid(String refundtxid) {
        this.refundtxid = refundtxid;
    }

    public String getRefundtxhash() {
        return this.refundtxhash;
    }

    public void setRefundtxhash(String refundtxhash) {
        this.refundtxhash = refundtxhash;
    }

    public String getTransactionid() {
        return this.transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactionhash() {
        return this.transactionhash;
    }

    public void setTransactionhash(String transactionhash) {
        this.transactionhash = transactionhash;
    }

    public String getRefundstatus() {
        return this.refundstatus;
    }

    public boolean isRefunded() {
        return this.refundstatus.equals(Bid.REFUND_REFUNDED);
    }

    public boolean isRefundIssued() {
        return this.refundstatus.equals(Bid.REFUND_ISSUED);
    }

    public boolean isRefundIssuing() {
        return this.refundstatus.equals(Bid.REFUND_ISSUING);
    }

    public boolean isRefundPending() {
        return this.refundstatus.equals(Bid.REFUND_PENDING);
    }

    public boolean isRefundError() {
        return this.refundstatus.equals(Bid.REFUND_ERROR);
    }

    public void setRefundstatus(String refundstatus) {
        this.refundstatus = refundstatus;
    }

    public String getScheduleId() {
        return this.scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Populates this object's properties from Json
     * @param json the Json representation of this object
     * @return Bid from the json data
     */
    @Override
    public Bid fromJson(io.vertx.core.json.JsonObject json) {
        this.setTimestamp(json.getString("timestamp"));
        this.setAuctionid(json.getInteger("auctionid"));
        this.setBidderaccountid(json.getString("bidderaccountid"));
        this.setBidamount(json.getLong("bidamount"));
        this.setStatus(json.getString("status"));
        this.setRefundtxid(json.getString("refundtxid"));
        this.setRefundtxhash(json.getString("refundtxhash"));
        this.setTransactionid(json.getString("transactionid"));
        this.setTransactionhash(json.getString("transactionhash"));
        this.setRefundstatus(json.getString("refundstatus"));
        this.setScheduleId(json.getString("scheduleid"));
        return this;
    }

    /**
     * Converts this object to a json representation
     * @return JsonObject representation of this Bid object
     */
    @Override
    public JsonObject toJson() {
        JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("timestamp",getTimestamp());
        json.put("auctionid",getAuctionid());
        json.put("bidderaccountid",getBidderaccountid());
        json.put("bidamount",getBidamount());
        json.put("status",getStatus());
        json.put("refundtxid",getRefundtxid());
        json.put("refundtxhash", getRefundtxhash());
        json.put("transactionid", getTransactionid());
        json.put("transactionhash", getTransactionhash());
        json.put("refundstatus", getRefundstatus());
        json.put("scheduleid", getScheduleId());
        return json;
    }
}