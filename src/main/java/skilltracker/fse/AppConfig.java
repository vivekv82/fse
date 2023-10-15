package skilltracker.fse;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import net.sf.log4jdbc.sql.jdbcapi.DataSourceSpy;

public class AppConfig {
    DataSourceProperties dataSourceProperties;

    DataSource realDataSource() {
        DataSource dataSource = null;
        return dataSource;
    }

    DataSource dataSource() {
        return new DataSourceSpy(realDataSource());
    }
}