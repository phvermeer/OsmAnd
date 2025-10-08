package net.osmand.aidl.tiles;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.File;

public class MapTileParams implements Parcelable {

	private int x;
	private int y;
	private int z;
	private int widthPixels;
	private int heightPixels;

	public MapTileParams(int x, int y, int z, int widthPixels, int heightPixels) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.widthPixels = widthPixels;
		this.heightPixels = heightPixels;
	}

	public MapTileParams(Parcel in) {
		readFromParcel(in);
	}

	public static final Creator<MapTileParams> CREATOR = new
			Creator<MapTileParams>() {
				public MapTileParams createFromParcel(Parcel in) {
					return new MapTileParams(in);
				}

				public MapTileParams[] newArray(int size) {
					return new MapTileParams[size];
				}
			};

	public int getX() {
		return x;
	}
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

	public void writeToParcel(Parcel out, int flags) {
		out.writeInt(x);
		out.writeInt(y);
		out.writeInt(z);
		out.writeInt(widthPixels);
		out.writeInt(heightPixels);
	}

	private void readFromParcel(Parcel in) {
		x = in.readInt();
		y = in.readInt();
		z = in.readInt();
		widthPixels = in.readInt();
		heightPixels = in.readInt();
	}

	public int describeContents() {
		return 0;
	}
}