package com.project.m.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.m.dao.JobEntriesDaoInterface;
import com.project.m.dao.db.ConnectionPool;
import com.project.m.entity.EntityBatches;
import com.project.m.entity.EntityJobEntries;
import com.project.m.exceptions.DaoException;
import com.project.m.service.CreatorEntity;

public class JobEntriesDao implements JobEntriesDaoInterface {

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
	public LinkedList<EntityJobEntries> loadJobEntriesByBatchId(Integer batchId) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet set = null;

		LinkedList<EntityJobEntries> result = new LinkedList<EntityJobEntries>();

		try {
			connection = ConnectionPool.getInstance().getConnection();
			statement = connection.prepareStatement("SELECT * FROM [dbo].[JobEntries] WHERE JobId = ?");
			statement.setInt(1, batchId);

			set = statement.executeQuery();

			while (set.next()) {
				@SuppressWarnings("resource")
				ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				CreatorEntity ceratorEntity = (CreatorEntity) context.getBean("creatorEntity");
				EntityJobEntries entity = ceratorEntity.createDboJobEntriesEntity(set);

				result.add(entity);
			}
		} catch (SQLException e) {
			throw new DaoException("Exception in loadJobEntriesByBatchId().", e);
		} finally {
			ConnectionPool.closeDbResources(connection, statement, set);
		}

		return result;
	}

}
