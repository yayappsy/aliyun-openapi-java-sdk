/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.ProfileGetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProfileGetResponseUnmarshaller {

	public static ProfileGetResponse unmarshall(ProfileGetResponse profileGetResponse, UnmarshallerContext context) {
		
		profileGetResponse.setRequestId(context.stringValue("ProfileGetResponse.RequestId"));
		profileGetResponse.setErrorCode(context.integerValue("ProfileGetResponse.ErrorCode"));
		profileGetResponse.setErrorMessage(context.stringValue("ProfileGetResponse.ErrorMessage"));
		profileGetResponse.setSuccess(context.booleanValue("ProfileGetResponse.Success"));
		profileGetResponse.setUserId(context.longValue("ProfileGetResponse.UserId"));
		profileGetResponse.setAutoInstall(context.booleanValue("ProfileGetResponse.AutoInstall"));
		profileGetResponse.setEnableInstallAgentNewECS(context.booleanValue("ProfileGetResponse.EnableInstallAgentNewECS"));
	 
	 	return profileGetResponse;
	}
}