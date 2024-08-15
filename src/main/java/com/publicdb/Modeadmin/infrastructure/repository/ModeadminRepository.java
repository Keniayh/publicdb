package com.publicdb.Modeadmin.infrastructure.repository;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;
import com.publicdb.Modeadmin.domain.service.Modeadmin;
import com.publicdb.Modeadmin.domain.service.ModeadminService;
import java.util.Properties;
import java.sql.*;
import java.util.Optional;

public class ModeadminRepository implements ModeadminService {
    private Connection connection;

    public ModeadminRepository() {
        try {
            Properties props = nre Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exeption e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createModeadmin(com.publicdb.Modeadmin.domain.entity.Modeadmin modeadmin) {
        String sql = "INSERT INTO modeadministration (descriptionmode) VALUES (?)";
        
        try (PreparableStatement statement = connection.prepareStatement(sql, PreparableStatement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, modeadmin.getDescriptionmode());
            statement.executeUpdate();

            try (Resultset generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    modeadmin.setId(generatedKeys.getInt(1));
                }
            }
            connection.close();
        } catch (SQLExeption e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Modeadmin> findModeadminById(Int id){
        String query = "SELECT id, descriptionmode FROM modeadministration WHERE id = ?";
        try (PreparableStatement statement = connection.prepareStatement(query)){
            statement.setInt(1, id);
            try (Resultset resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Modeadmin modeadmin = new Modeadmin(
                        resultSet.getInt("id"),
                        resultSet.getString("descriptionmode")
                    );
                    return Optional.of(modeadmin);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    

    
}
