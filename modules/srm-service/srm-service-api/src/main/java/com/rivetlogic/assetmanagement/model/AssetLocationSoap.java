/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.assetmanagement.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AssetLocationSoap implements Serializable {
	public static AssetLocationSoap toSoapModel(AssetLocation model) {
		AssetLocationSoap soapModel = new AssetLocationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetLocationId(model.getAssetLocationId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static AssetLocationSoap[] toSoapModels(AssetLocation[] models) {
		AssetLocationSoap[] soapModels = new AssetLocationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetLocationSoap[][] toSoapModels(AssetLocation[][] models) {
		AssetLocationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetLocationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetLocationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetLocationSoap[] toSoapModels(List<AssetLocation> models) {
		List<AssetLocationSoap> soapModels = new ArrayList<AssetLocationSoap>(models.size());

		for (AssetLocation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetLocationSoap[soapModels.size()]);
	}

	public AssetLocationSoap() {
	}

	public long getPrimaryKey() {
		return _assetLocationId;
	}

	public void setPrimaryKey(long pk) {
		setAssetLocationId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetLocationId() {
		return _assetLocationId;
	}

	public void setAssetLocationId(long assetLocationId) {
		_assetLocationId = assetLocationId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _assetLocationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private String _name;
	private String _description;
}