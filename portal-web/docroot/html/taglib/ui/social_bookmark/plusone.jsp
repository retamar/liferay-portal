<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
--%>

<%@ include file="/html/taglib/ui/social_bookmark/init.jsp" %>

<%
String plusOneDisplayStyle = "medium";

if (displayStyle.equals("vertical")) {
	plusOneDisplayStyle = "tall";
}
%>

<liferay-util:html-bottom outputKey="taglib_ui_social_bookmark_plusone">
	<script src="https://apis.google.com/js/plusone.js" type="text/javascript">
		{
			lang: '<%= locale.getDisplayLanguage() %>'
		}
	</script>
</liferay-util:html-bottom>

<g:plusone
	count="<%= !displayStyle.equals("simple") %>"
	href="<%= url %>"
	size="<%= plusOneDisplayStyle %>"
>
</g:plusone>