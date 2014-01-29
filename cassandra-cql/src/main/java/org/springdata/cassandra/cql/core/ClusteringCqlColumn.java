/*
 * Copyright 2014 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springdata.cassandra.cql.core;

import com.datastax.driver.core.DataType;

/**
 * ClusteringCqlColumn is used in createTable operation
 * 
 * @author Alex Shvid
 * 
 */
public class ClusteringCqlColumn extends CqlColumn {

	private Ordering ordering;

	public ClusteringCqlColumn(String name, DataType type, Ordering ordering) {
		super(name, type);
		this.ordering = ordering;
	}

	public Ordering getOrdering() {
		return ordering;
	}

	public void setOrdering(Ordering ordering) {
		this.ordering = ordering;
	}

}