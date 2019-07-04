/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.core.log;

import com.epam.ta.reportportal.commons.ReportPortalUser;
import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.commons.querygen.Queryable;
import com.epam.ta.reportportal.entity.log.Log;
import com.epam.ta.reportportal.ws.model.log.LogResource;
import org.springframework.data.domain.Pageable;

import java.util.Map;

/**
 * GET operation for {@link Log} entity
 *
 * @author Andrei Varabyeu
 */
public interface GetLogHandler {

	/**
	 * Returns logs for specified filter
	 *
	 * @param filterable - filter definition
	 * @param pageable   - pageable definition
	 * @return Iterable<LogResource>
	 */
	Iterable<LogResource> getLogs(ReportPortalUser.ProjectDetails projectDetails, Filter filterable, Pageable pageable);

	/**
	 * Returns log by ID
	 *
	 * @param logId          - target log ID value
	 * @param projectDetails Project details
	 * @param user           User
	 * @return LogResource
	 */
	LogResource getLog(Long logId, ReportPortalUser.ProjectDetails projectDetails, ReportPortalUser user);

	/**
	 * Calculates page number and returns entire page for specified log ID
	 *
	 * @param logId          ID of log to find
	 * @param projectDetails Project details
	 * @param filterable     Filter for paging
	 * @param pageable       Paging details
	 * @return Page Number
	 */
	long getPageNumber(Long logId, ReportPortalUser.ProjectDetails projectDetails, Filter filterable, Pageable pageable);

	Iterable<?> getNestedItems(Long parentId, ReportPortalUser.ProjectDetails projectDetails, Map<String, String> params, Queryable queryable, Pageable pageable);
}
