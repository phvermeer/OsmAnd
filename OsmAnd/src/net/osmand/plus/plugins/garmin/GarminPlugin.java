package net.osmand.plus.plugins.garmin;

import static net.osmand.aidlapi.OsmAndCustomizationConstants.PLUGIN_GARMIN;

import android.graphics.drawable.Drawable;

import net.osmand.plus.OsmandApplication;
import net.osmand.plus.R;
import net.osmand.plus.plugins.OsmandPlugin;
import net.osmand.plus.render.RendererRegistry;
import net.osmand.plus.settings.backend.ApplicationMode;

import java.util.Collections;
import java.util.List;

public class GarminPlugin extends OsmandPlugin {

	public static final String COMPONENT = "net.osmand.garminPlugin";

	public GarminPlugin(OsmandApplication app) {
		super(app);
	}

	@Override
	public CharSequence getDescription(boolean linksEnabled) {
		return app.getString(net.osmand.plus.R.string.plugin_garmin_descr);
	}

	@Override
	public String getName() {
		return app.getString(net.osmand.plus.R.string.plugin_garmin_name);
	}
	
	@Override
	public int getLogoResourceId() {
		return R.drawable.mx_route_activity_type_hiking;
	}
	
	@Override
	public Drawable getAssetResourceImage() {
		return app.getUIUtilities().getIcon(R.drawable.mx_route_activity_type_hiking);
	}

	@Override
	public boolean isMarketPlugin() {
		return true;
	}

	@Override
	public String getComponentId1() {
		return COMPONENT;
	}

	@Override
	public String getId() {
		return PLUGIN_GARMIN;
	}
}