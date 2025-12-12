package Q2022_3;

public class AssetLocation {
    private String asset;
    private int assetID;
    private double latitude;
    private double longitude;
    public AssetLocation(String asset, int assetID, double latitude, double longitude) {
        this.asset = asset;
        this.assetID = assetID;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getAsset() {
        return asset;
    }
    public int getAssetID() {
        return assetID;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public String setAsset(String asset) {
        return this.asset = asset;
    }
    public int setAssetID(int assetID) {
        return this.assetID = assetID;
    }
    public double setLatitude(double latitude) {
        return this.latitude = latitude;
    }
    public double setLongitude(double longitude) {
        return this.longitude = longitude;
    }
}
