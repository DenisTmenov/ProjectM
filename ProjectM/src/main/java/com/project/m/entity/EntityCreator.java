package com.project.m.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.project.m.exceptions.EntityException;

public class EntityCreator {

	public static DboBatchesEntity createDboBatchesEntity(ResultSet set) {
		Integer batchId = null;
		String batchName = null;
		Date createdDate = null;
		Boolean isActive = null;
		try {
			batchId = set.getInt("BatchId");
			batchName = set.getString("BatchName");
			createdDate = set.getDate("CreatedDate");
			isActive = set.getBoolean("IsActive");
		} catch (SQLException e) {
			throw new EntityException("Exception in createDboBatchesEntity().", e);
		}

		DboBatchesEntity entity = new DboBatchesEntity();

		entity.setBatchesId(batchId);
		entity.setBatchesName(batchName);
		entity.setCreateDate(createdDate);
		entity.setIsActive(isActive);

		return entity;
	}

	public static DboJobEntriesEntity createDboJobEntriesEntity(ResultSet set) {
		String entryId = null;
		Integer jobId = null;
		Integer itemStatus = null;
		String mailbox = null;
		String msgId = null;
		Date dateCreated = null;
		String folder = null;
		String subject = null;
		String author = null;
		String recipients = null;
		Date receivedDate = null;
		String size = null; // BigInteger
		String messageClass = null;
		String itemType = null;
		String owner = null;
		String fileName = null;
		Date dateModified = null;
		String statusMessage = null;
		Date discoveryDate = null;
		String path = null;
		String name = null;
		String folderCount = null; // BigInteger
		String messageCount = null; // BigInteger
		String emailCount = null; // BigInteger
		String calendarCount = null; // BigInteger
		String taskCount = null; // BigInteger
		String contactCount = null; // BigInteger
		String otherCount = null; // BigInteger
		String owner1 = null;
		String owner2 = null;
		String owner3 = null;
		String originalId = null;
		Integer folderId = null;
		Integer failedCount = null;
		Date statusDate = null;
		Boolean hashBytes = null;
		String extraData = null;
		String messageId = null;

		try {
			entryId = set.getString("EntryId");
			jobId = set.getInt("JobId");
			itemStatus = set.getInt("ItemStatus");
			mailbox = set.getString("Mailbox");
			msgId = set.getString("MsgId");
			dateCreated = set.getDate("DateCreated");
			folder = set.getString("Folder");
			subject = set.getString("Subject");
			author = set.getString("Author");
			recipients = set.getString("Recipients");
			receivedDate = set.getDate("ReceivedDate");
			size = set.getString("Size");
			messageClass = set.getString("MessageClass");
			itemType = set.getString("ItemType");
			owner = set.getString("Owner");
			fileName = set.getString("FileName");
			dateModified = set.getDate("DateModified");
			statusMessage = set.getString("StatusMessage");
			discoveryDate = set.getDate("DiscoveryDate");
			path = set.getString("Path");
			name = set.getString("Name");
			folderCount = set.getString("FolderCount");
			messageCount = set.getString("MessageCount");
			emailCount = set.getString("EmailCount");
			calendarCount = set.getString("CalendarCount");
			taskCount = set.getString("TaskCount");
			contactCount = set.getString("ContactCount");
			otherCount = set.getString("OtherCount");
			owner1 = set.getString("Owner1");
			owner2 = set.getString("Owner2");
			owner3 = set.getString("Owner3");
			originalId = set.getString("OriginalId");
			folderId = set.getInt("FolderId");
			failedCount = set.getInt("FailedCount");
			statusDate = set.getDate("StatusDate");
			hashBytes = set.getBoolean("HashBytes");
			extraData = set.getString("ExtraData");
			messageId = set.getString("MessageId");

		} catch (SQLException e) {
			throw new EntityException("Exception in createDboBatchesEntity().", e);
		}

		DboJobEntriesEntity entity = new DboJobEntriesEntity();

		entity.setEntryId(entryId);
		entity.setJobId(jobId);
		entity.setItemStatus(itemStatus);
		entity.setMailbox(mailbox);
		entity.setMsgId(msgId);
		entity.setDateCreated(dateCreated);
		entity.setFolder(folder);
		entity.setSubject(subject);
		entity.setAuthor(author);
		entity.setRecipients(recipients);
		entity.setReceivedDate(receivedDate);
		entity.setSize(size);
		entity.setMessageClass(messageClass);
		entity.setItemType(itemType);
		entity.setOwner(owner);
		entity.setFileName(fileName);
		entity.setDateModified(dateModified);
		entity.setStatusMessage(statusMessage);
		entity.setDiscoveryDate(discoveryDate);
		entity.setPath(path);
		entity.setName(name);
		entity.setFolderCount(folderCount);
		entity.setMessageCount(messageCount);
		entity.setEmailCount(emailCount);
		entity.setCalendarCount(calendarCount);
		entity.setTaskCount(taskCount);
		entity.setContactCount(contactCount);
		entity.setOtherCount(otherCount);
		entity.setOwner1(owner1);
		entity.setOwner2(owner2);
		entity.setOwner3(owner3);
		entity.setOriginalId(originalId);
		entity.setFolderId(folderId);
		entity.setFailedCount(failedCount);
		entity.setStatusDate(statusDate);
		entity.setHashBytes(hashBytes);
		entity.setExtraData(extraData);
		entity.setMessageId(messageId);

		return entity;
	}

}
