package com.lybratepuneetverma.models;

import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("wrapperType")
    public String wrapperType;
    @SerializedName("kind")
    public String kind;
    @SerializedName("artistId")
    public Integer artistId;
    @SerializedName("collectionId")
    public Integer collectionId;
    @SerializedName("trackId")
    public Integer trackId;
    @SerializedName("artistName")
    public String artistName;
    @SerializedName("collectionName")
    public String collectionName;
    @SerializedName("trackName")
    public String trackName;
    @SerializedName("collectionCensoredName")
    public String collectionCensoredName;
    @SerializedName("trackCensoredName")
    public String trackCensoredName;
    @SerializedName("artistViewUrl")
    public String artistViewUrl;
    @SerializedName("collectionViewUrl")
    public String collectionViewUrl;
    @SerializedName("trackViewUrl")
    public String trackViewUrl;
    @SerializedName("previewUrl")
    public String previewUrl;
    @SerializedName("artworkUrl30")
    public String artworkUrl30;
    @SerializedName("artworkUrl60")
    public String artworkUrl60;
    @SerializedName("artworkUrl100")
    public String artworkUrl100;
    @SerializedName("collectionPrice")
    public Float collectionPrice;
    @SerializedName("trackPrice")
    public Float trackPrice;
    @SerializedName("releaseDate")
    public String releaseDate;
    @SerializedName("collectionExplicitness")
    public String collectionExplicitness;
    @SerializedName("trackExplicitness")
    public String trackExplicitness;
    @SerializedName("discCount")
    public Integer discCount;
    @SerializedName("discNumber")
    public Integer discNumber;
    @SerializedName("trackCount")
    public Integer trackCount;
    @SerializedName("trackNumber")
    public Integer trackNumber;
    @SerializedName("trackTimeMillis")
    public Integer trackTimeMillis;
    @SerializedName("country")
    public String country;
    @SerializedName("currency")
    public String currency;
    @SerializedName("primaryGenreName")
    public String primaryGenreName;
    @SerializedName("contentAdvisoryRating")
    public String contentAdvisoryRating;

    public Track(String wrapperType, String kind, Integer artistId, Integer collectionId, Integer trackId, String artistName, String collectionName, String trackName, String collectionCensoredName, String trackCensoredName, String artistViewUrl, String collectionViewUrl, String trackViewUrl, String previewUrl, String artworkUrl30, String artworkUrl60, String artworkUrl100, Float collectionPrice, Float trackPrice, String releaseDate, String collectionExplicitness, String trackExplicitness, Integer discCount, Integer discNumber, Integer trackCount, Integer trackNumber, Integer trackTimeMillis, String country, String currency, String primaryGenreName, String contentAdvisoryRating) {
        this.wrapperType = wrapperType;
        this.kind = kind;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.trackId = trackId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.trackName = trackName;
        this.collectionCensoredName = collectionCensoredName;
        this.trackCensoredName = trackCensoredName;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.trackViewUrl = trackViewUrl;
        this.previewUrl = previewUrl;
        this.artworkUrl30 = artworkUrl30;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionPrice = collectionPrice;
        this.trackPrice = trackPrice;
        this.releaseDate = releaseDate;
        this.collectionExplicitness = collectionExplicitness;
        this.trackExplicitness = trackExplicitness;
        this.discCount = discCount;
        this.discNumber = discNumber;
        this.trackCount = trackCount;
        this.trackNumber = trackNumber;
        this.trackTimeMillis = trackTimeMillis;
        this.country = country;
        this.currency = currency;
        this.primaryGenreName = primaryGenreName;
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public String getKind() {
        return kind;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public Float getCollectionPrice() {
        return collectionPrice;
    }

    public Float getTrackPrice() {
        return trackPrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public Integer getDiscCount() {
        return discCount;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public Integer getTrackCount() {
        return trackCount;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "wrapperType='" + wrapperType + '\'' +
                ", kind='" + kind + '\'' +
                ", artistId=" + artistId +
                ", collectionId=" + collectionId +
                ", trackId=" + trackId +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", collectionCensoredName='" + collectionCensoredName + '\'' +
                ", trackCensoredName='" + trackCensoredName + '\'' +
                ", artistViewUrl='" + artistViewUrl + '\'' +
                ", collectionViewUrl='" + collectionViewUrl + '\'' +
                ", trackViewUrl='" + trackViewUrl + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", artworkUrl30='" + artworkUrl30 + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", collectionPrice=" + collectionPrice +
                ", trackPrice=" + trackPrice +
                ", releaseDate='" + releaseDate + '\'' +
                ", collectionExplicitness='" + collectionExplicitness + '\'' +
                ", trackExplicitness='" + trackExplicitness + '\'' +
                ", discCount=" + discCount +
                ", discNumber=" + discNumber +
                ", trackCount=" + trackCount +
                ", trackNumber=" + trackNumber +
                ", trackTimeMillis=" + trackTimeMillis +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                ", contentAdvisoryRating='" + contentAdvisoryRating + '\'' +
                '}';
    }
}
