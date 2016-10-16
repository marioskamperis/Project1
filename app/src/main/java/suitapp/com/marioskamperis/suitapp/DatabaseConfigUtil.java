package suitapp.com.marioskamperis.suitapp;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Marios on 10/16/2016.
 */
public class DatabaseConfigUtil extends OrmLiteConfigUtil {


    private static final Class<?>[] classes = new Class[]{Item.class};

    public static void main(String[] args) throws IOException, SQLException {

        writeConfigFile("ormlite_config.txt", classes);

    }
}
