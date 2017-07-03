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

	public static DboJobHistoriesEntity createDboJobHistoriesEntity(ResultSet set) {
		Integer jobId = null;
		Integer jobStatus = null;
		Date timeStarted = null;
		Date timeFinished = null;
		String targetType = null;
		String sourceType = null;
		Date dateFrom = null;
		Date dateTo = null;
		String ItemsTotal = null;
		String itemsFailed = null;
		String itemsRemaining = null;
		String sMVersion = null;
		Integer source = null;
		Integer target = null;
		String jobCreatedBy = null;
		String jobModifiedBy = null;
		Date jobCreated = null;
		Date jobModified = null;
		Integer batchId = null;
		Integer failedCount = null;
		Integer processingInBatch = null;
		String processingOnMachine = null;
		Integer processingRate = null;
		Date lastUpdate = null;
		String config = null;
		String statusMessage = null;
		Integer priority = null;
		Integer percentComplete = null;
		String sourceMailbox = null;
		String targetMailbox = null;
		Integer processingItems = null;
		Date statusDate = null;
		Integer rehydrationType = null;
		Integer ownerId = null;

		try {
			jobId = set.getInt("JobId");
			jobStatus = set.getInt("JobStatus");
			timeStarted = set.getDate("TimeStarted");
			timeFinished = set.getDate("TimeFinished");
			targetType = set.getString("TargetType");
			sourceType = set.getString("SourceType");
			dateFrom = set.getDate("DateFrom");
			dateTo = set.getDate("DateTo");
			ItemsTotal = set.getString("ItemsTotal");
			itemsFailed = set.getString("ItemsFailed");
			itemsRemaining = set.getString("ItemsRemaining");
			sMVersion = set.getString("SMVersion");
			source = set.getInt("Source");
			target = set.getInt("Target");
			jobCreatedBy = set.getString("JobCreatedBy");
			jobModifiedBy = set.getString("JobModifiedBy");
			jobCreated = set.getDate("JobCreated");
			jobModified = set.getDate("JobModified");
			batchId = set.getInt("BatchId");
			failedCount = set.getInt("FailedCount");
			processingInBatch = set.getInt("ProcessingInBatch");
			processingOnMachine = set.getString("ProcessingOnMachine");
			processingRate = set.getInt("ProcessingRate");
			lastUpdate = set.getDate("LastUpdate");
			config = set.getString("Config");
			statusMessage = set.getString("StatusMessage");
			priority = set.getInt("Priority");
			percentComplete = set.getInt("PercentComplete");
			sourceMailbox = set.getString("SourceMailbox");
			targetMailbox = set.getString("TargetMailbox");
			processingItems = set.getInt("ProcessingItems");
			statusDate = set.getDate("StatusDate");
			rehydrationType = set.getInt("RehydrationType");
			ownerId = set.getInt("OwnerId");

		} catch (SQLException e) {
			throw new EntityException("Exception in createDboJobHistoriesEntity().", e);
		}

		DboJobHistoriesEntity entity = new DboJobHistoriesEntity();

		entity.setJobId(jobId);
		entity.setJobStatus(jobStatus);
		entity.setTimeStarted(timeStarted);
		entity.setTimeFinished(timeFinished);
		entity.setTargetType(targetType);
		entity.setSourceType(sourceType);
		entity.setDateFrom(dateFrom);
		entity.setDateTo(dateTo);
		entity.setItemsTotal(ItemsTotal);
		entity.setItemsFailed(itemsFailed);
		entity.setItemsRemaining(itemsRemaining);
		entity.setSMVersion(sMVersion);
		entity.setSource(source);
		entity.setTarget(target);
		entity.setJobCreatedBy(jobCreatedBy);
		entity.setJobModifiedBy(jobModifiedBy);
		entity.setJobCreated(jobCreated);
		entity.setJobModified(jobModified);
		entity.setBatchId(batchId);
		entity.setFailedCount(failedCount);
		entity.setProcessingInBatch(processingInBatch);
		entity.setProcessingOnMachine(processingOnMachine);
		entity.setProcessingRate(processingRate);
		entity.setLastUpdate(lastUpdate);
		entity.setConfig(config);
		entity.setStatusMessage(statusMessage);
		entity.setPriority(priority);
		entity.setPercentComplete(percentComplete);
		entity.setSourceMailbox(sourceMailbox);
		entity.setTargetMailbox(targetMailbox);
		entity.setProcessingItems(processingItems);
		entity.setStatusDate(statusDate);
		entity.setRehydrationType(rehydrationType);
		entity.setOwnerId(ownerId);

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
		String size = null;
		String messageClass = null;
		String itemType = null;
		String owner = null;
		String fileName = null;
		Date dateModified = null;
		String statusMessage = null;
		Date discoveryDate = null;
		String path = null;
		String name = null;
		String folderCount = null;
		String messageCount = null;
		String emailCount = null;
		String calendarCount = null;
		String taskCount = null;
		String contactCount = null;
		String otherCount = null;
		String owner1 = null;
		String owner2 = null;
		String owner3 = null;
		String originalId = null;
		Integer folderId = null;
		Integer failedCount = null;
		Date statusDate = null;
		String hashBytes = null; // Boolean
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
			hashBytes = set.getString("HashBytes");
			extraData = set.getString("ExtraData");
			messageId = set.getString("MessageId");

		} catch (SQLException e) {
			throw new EntityException("Exception in createDboJobEntriesEntity().", e);
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
