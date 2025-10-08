package net.osmand.aidlapi.tiles;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

import net.osmand.aidlapi.AidlParams;

public class MapTileParams extends AidlParams {

    private int x,y,z;
    private int widthPixels;
    private int heightPixels;

    public MapTileParams(int x, int y , int z, int widthPixels, int heightPixels) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public MapTileParams(Parcel in) {
        readFromParcel(in);
    }

    public static final Creator<MapTileParams> CREATOR = new Creator<MapTileParams>() {
        @Override
        public MapTileParams createFromParcel(Parcel in) {
            return new MapTileParams(in);
        }

        @Override
        public MapTileParams[] newArray(int size) {
            return new MapTileParams[size];
        }
    };

    public int getX() { return x; }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    public int getWidthPixels() {
        return widthPixels;
    }
    public int getHeightPixels() {
        return heightPixels;
    }

    @Override
    public void writeToBundle(Bundle bundle) {
        bundle.putInt("x", x);
        bundle.putInt("y", y);
        bundle.putInt("z", z);
        bundle.putInt("widthPixels", widthPixels);
        bundle.putInt("heightPixels", heightPixels);
    }

    @Override
    protected void readFromBundle(Bundle bundle) {
        bundle.setClassLoader(Uri.class.getClassLoader());

        x = bundle.getInt("x");
        y = bundle.getInt("y");
        z = bundle.getInt("z");
        widthPixels = bundle.getInt("widthPixels");
        heightPixels = bundle.getInt("heightPixels");
    }
}