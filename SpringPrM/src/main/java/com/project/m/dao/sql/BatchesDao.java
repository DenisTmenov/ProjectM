package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.m.dao.BatchesDaoInterface;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.exceptions.DaoException;
import com.project.m.service.CreatorEntity;

public class BatchesDao implements BatchesDaoInterface {

	@Override
	public void save(EntityBatches bean) throws DaoException {
	}

	@Override
	public void update(EntityBatches bean) throws DaoException {
	}

	@Override
	public void remove(Integer batchId) throws DaoException {
	}

	@Override
	public LinkedList<EntityBatches> loadAllBatches() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<EntityBatches> result = new LinkedList<EntityBatches>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[Batches]");
			set = statement.executeQuery();

			while (set.next()) {
				@SuppressWarnings("resource")
				ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				CreatorEntity ceratorEntity = (CreatorEntity) context.getBean("creatorEntity");
				EntityBatches entity = ceratorEntity.createDboBatchesEntity(set);

				result.add(entity);
			}
		} catch (SQLException e) {
			throw new DaoException("Exception in loadAllBatches().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

}
