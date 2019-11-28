/**
 * File: ReplyMessage.java
 * 
 * Copyright (C) 2019 CPSwarm Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public abstract class ReplyMessage extends Message {

	public enum Status {

		@SerializedName("ok")
		OK,

		@SerializedName("error")
		ERROR
	}

	@SerializedName("status")
	protected Status operationStatus;

	
	public ReplyMessage(String type, String id, String description, Status operationStatus) {
		super(type, id, description);
		this.operationStatus = operationStatus;
	}

	public Status getOperationStatus() {
		return operationStatus;
	}
}
