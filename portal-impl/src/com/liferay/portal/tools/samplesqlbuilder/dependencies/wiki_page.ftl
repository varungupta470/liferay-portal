<#setting number_format = "0">

insert into WikiPage values ('${portalUUIDUtil.generate()}', ${wikiPage.pageId}, ${wikiPage.resourcePrimKey}, ${wikiPage.groupId}, ${companyId}, ${wikiPage.userId}, '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ${wikiPage.nodeId}, '${wikiPage.title}', ${wikiPage.version}, FALSE, '${wikiPage.content}', '', 'creole', <#if wikiPage.head>TRUE<#else>FALSE</#if>, '', '', ${wikiPage.status}, ${wikiPage.statusByUserId}, '${wikiPage.statusByUserName}', CURRENT_TIMESTAMP);

insert into WikiPageResource values ('${portalUUIDUtil.generate()}', ${wikiPage.resourcePrimKey}, ${wikiPage.nodeId}, '${wikiPage.title}');

<#if wikiPage.head>
	<#assign assetEntry = dataFactory.newAssetEntry(wikiNode.groupId, wikiPage.userId, dataFactory.wikiPageClassNameId, wikiPage.resourcePrimKey, true, "text/html", wikiPage.title)>

	insert into AssetEntry (entryId, groupId, companyId, userId, createDate, modifiedDate, classNameId, classPK, visible, mimeType, title) values (${counter.get()}, ${assetEntry.groupId}, ${companyId}, ${assetEntry.userId}, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ${assetEntry.classNameId}, ${assetEntry.classPK}, <#if assetEntry.visible>TRUE<#else>FALSE</#if>, '${assetEntry.mimeType}', '${assetEntry.title}');
</#if>