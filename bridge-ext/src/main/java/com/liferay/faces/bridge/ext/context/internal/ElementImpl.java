/**
 * Copyright (c) 2000-2017 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.bridge.ext.context.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.faces.component.UIComponent;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;


/**
 * @author  Neil Griffin
 */
public class ElementImpl extends ElementCompatImpl {

	// Private Data Members
	private Map<String, String> attributes;
	private String nodeName;
	private short nodeType;
	private String nodeValue;
	private String prefix;
	private String textContent;

	public ElementImpl(String nodeName, UIComponent uiComponent) {
		this.nodeName = nodeName;
		this.attributes = getAttributes(uiComponent);
	}

	public Node appendChild(Node newChild) throws DOMException {
		return null;
	}

	public Node cloneNode(boolean deep) {
		return null;
	}

	public short compareDocumentPosition(Node other) throws DOMException {
		return 0;
	}

	public String getAttribute(String name) {
		return null;
	}

	public Attr getAttributeNode(String name) {
		return null;
	}

	public Attr getAttributeNodeNS(String namespaceURI, String localName) throws DOMException {
		return null;
	}

	public String getAttributeNS(String namespaceURI, String localName) throws DOMException {
		return null;
	}

	public NamedNodeMap getAttributes() {
		return null;
	}

	public String getBaseURI() {
		return null;
	}

	public NodeList getChildNodes() {
		return null;
	}

	public NodeList getElementsByTagName(String name) {
		return null;
	}

	public NodeList getElementsByTagNameNS(String namespaceURI, String localName) throws DOMException {
		return null;
	}

	public Object getFeature(String feature, String version) {
		return null;
	}

	public Node getFirstChild() {
		return null;
	}

	public Node getLastChild() {
		return null;
	}

	public String getLocalName() {
		return null;
	}

	public String getNamespaceURI() {
		return null;
	}

	public Node getNextSibling() {
		return null;
	}

	public String getNodeName() {
		return nodeName;
	}

	public short getNodeType() {
		return nodeType;
	}

	public String getNodeValue() throws DOMException {
		return nodeValue;
	}

	public Document getOwnerDocument() {
		return null;
	}

	public Node getParentNode() {
		return null;
	}

	public String getPrefix() {
		return prefix;
	}

	public Node getPreviousSibling() {
		return null;
	}

	public TypeInfo getSchemaTypeInfo() {
		return null;
	}

	public String getTagName() {
		return null;
	}

	public String getTextContent() throws DOMException {
		return textContent;
	}

	public Object getUserData(String key) {
		return null;
	}

	public boolean hasAttribute(String name) {
		return false;
	}

	public boolean hasAttributeNS(String namespaceURI, String localName) throws DOMException {
		return false;
	}

	public boolean hasAttributes() {
		return false;
	}

	public boolean hasChildNodes() {
		return false;
	}

	public Node insertBefore(Node newChild, Node refChild) throws DOMException {
		return null;
	}

	public boolean isDefaultNamespace(String namespaceURI) {
		return false;
	}

	public boolean isEqualNode(Node arg) {
		return false;
	}

	public boolean isSameNode(Node other) {
		return false;
	}

	public boolean isSupported(String feature, String version) {
		return false;
	}

	public String lookupNamespaceURI(String prefix) {
		return null;
	}

	public String lookupPrefix(String namespaceURI) {
		return null;
	}

	public void normalize() {
		// no-op
	}

	public void removeAttribute(String name) throws DOMException {
		// no-op
	}

	public Attr removeAttributeNode(Attr oldAttr) throws DOMException {
		return null;
	}

	public void removeAttributeNS(String namespaceURI, String localName) throws DOMException {
	}

	public Node removeChild(Node oldChild) throws DOMException {
		return null;
	}

	public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
		return null;
	}

	public void setAttribute(String name, String value) throws DOMException {
		attributes.put(name, value);
	}

	public Attr setAttributeNode(Attr newAttr) throws DOMException {
		return null;
	}

	public Attr setAttributeNodeNS(Attr newAttr) throws DOMException {
		return null;
	}

	public void setAttributeNS(String namespaceURI, String qualifiedName, String value) throws DOMException {
	}

	public void setIdAttribute(String name, boolean isId) throws DOMException {
		// no-op
	}

	public void setIdAttributeNode(Attr idAttr, boolean isId) throws DOMException {
		// no-op
	}

	public void setIdAttributeNS(String namespaceURI, String localName, boolean isId) throws DOMException {
		// no-op
	}

	public void setNodeValue(String nodeValue) throws DOMException {
		this.nodeValue = nodeValue;
	}

	public void setPrefix(String prefix) throws DOMException {
		this.prefix = prefix;
	}

	public void setTextContent(String textContent) throws DOMException {
		this.textContent = textContent;
	}

	public Object setUserData(String key, Object data, UserDataHandler handler) {
		return null;
	}

	@Override
	public String toString() {

		StringBuilder buf = new StringBuilder();
		buf.append("<");
		buf.append(nodeName);

		Set<String> attributeNameSet = attributes.keySet();

		if (attributeNameSet != null) {

			for (String attributeName : attributeNameSet) {
				buf.append(" ");
				buf.append(attributeName);
				buf.append("=\"");
				buf.append(attributes.get(attributeName));
				buf.append("\"");
			}
		}

		if ("link".equalsIgnoreCase(nodeName)) {

			buf.append(" />");
		}
		else {

			buf.append(">");

			if (textContent != null) {
				buf.append(textContent);
			}

			buf.append("</");
			buf.append(nodeName);
			buf.append(">");
		}

		return buf.toString();
	}

}
