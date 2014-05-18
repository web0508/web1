<%-- <%@tag import="java.util.Map"%><%@tag import="java.util.List"%><%@tag import="cmcc.gz.platform.core.utils.CoreConstants"%><%@tag import="cmcc.gz.platform.core.utils.CommonUtils"%><%@tag import="cmcc.gz.platform.core.utils.TreeUtil"%><%@tag import="cmcc.gz.platform.core.utils.JsonUtil"%><%@tag body-content="empty"%>
<%
	List<Map> list = (List<Map>)session.getAttribute(CoreConstants.HTTP_SESSION_ATTRIBUTE_ACCESS_MENU_INFO);
	TreeUtil treeMenu = new TreeUtil();
	List<Map> nodes = treeMenu.buildCommonTree(list, new String[]{"url", "navUrl", "menucode"});
	for(Map map : nodes) {
		System.out.print(map);
    	out.println("<div title='"+map.get("text")+"' data-options=\"iconCls:'"+(CommonUtils.isEmpty((String)map.get("iconCls")) ? "icon-directory" : map.get("iconCls"))+"'\">");
    	out.println("<div class='easyui-panel' fit='true' border='false'>");
    	out.println("<ul id='menu-"+map.get("id")+"' class='easyui-tree' data-options=\"lines:true,onClick:addTab\"></ul>");
    	out.println("</div></div>");
    	out.println("<script type=\"text/javascript\">$('#menu-"+map.get("id")+"').tree({data:"+JsonUtil.toJson(map.get("children"))+"});</script>");
    }
%> --%>

