/*
 * Oktawave API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.oktawave.api.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FullPage health check
 */
@ApiModel(description = "FullPage health check")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-03T15:23:33.358+01:00")
public class HealthCheckFullPage {
  @SerializedName("HttpMethod")
  private DictionaryItem httpMethod = null;

  @SerializedName("ContentRegularExpression")
  private String contentRegularExpression = null;

  @SerializedName("ContentNegativeRegularExpression")
  private String contentNegativeRegularExpression = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("PageTimeout")
  private Integer pageTimeout = null;

  @SerializedName("ElementTimeout")
  private Integer elementTimeout = null;

  @SerializedName("ElementsTotalTimeout")
  private Integer elementsTotalTimeout = null;

  @SerializedName("FetchPageElements")
  private Boolean fetchPageElements = null;

  @SerializedName("MaxRedirects")
  private Integer maxRedirects = null;

  @SerializedName("MaxParallelRequests")
  private Integer maxParallelRequests = null;

  @SerializedName("GenerateHar")
  private Boolean generateHar = null;

  @SerializedName("AllowedElementErrorCount")
  private Integer allowedElementErrorCount = null;

  @SerializedName("ContentSizeLimit")
  private Integer contentSizeLimit = null;

  @SerializedName("IgnoreHtmlParsingTime")
  private Boolean ignoreHtmlParsingTime = null;

  @SerializedName("SaveCookies")
  private Boolean saveCookies = null;

  @SerializedName("DisableContentEncoding")
  private Boolean disableContentEncoding = null;

  @SerializedName("Content")
  private String content = null;

  @SerializedName("ContentType")
  private String contentType = null;

  @SerializedName("IgnoredElementsFilter")
  private String ignoredElementsFilter = null;

  @SerializedName("ElementsFilter")
  private String elementsFilter = null;

  @SerializedName("NotificationTypes")
  private List<DictionaryItem> notificationTypes = null;

  @SerializedName("NotificationEventTypes")
  private List<DictionaryItem> notificationEventTypes = null;

  @SerializedName("NotificationTime")
  private DictionaryItem notificationTime = null;

  @SerializedName("LocationsFailoverEnabled")
  private Boolean locationsFailoverEnabled = null;

  @SerializedName("ErrorTolerance")
  private Integer errorTolerance = null;

  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Interval")
  private Integer interval = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Address")
  private String address = null;

  @SerializedName("ServiceType")
  private DictionaryItem serviceType = null;

  @SerializedName("State")
  private DictionaryItem state = null;

  @SerializedName("DetailsLocation")
  private String detailsLocation = null;

  @SerializedName("Paused")
  private Boolean paused = null;

  @SerializedName("Suspended")
  private Boolean suspended = null;

  @SerializedName("LastInvalidCheck")
  private OffsetDateTime lastInvalidCheck = null;

  @SerializedName("LastValidCheck")
  private OffsetDateTime lastValidCheck = null;

    @SerializedName("Description")
    private String description = null;

  public HealthCheckFullPage httpMethod(DictionaryItem httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * Health check http method type
   * @return httpMethod
  **/
  @ApiModelProperty(value = "Health check http method type")
  public DictionaryItem getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(DictionaryItem httpMethod) {
    this.httpMethod = httpMethod;
  }

  public HealthCheckFullPage contentRegularExpression(String contentRegularExpression) {
    this.contentRegularExpression = contentRegularExpression;
    return this;
  }

   /**
   * The content has to match the expression (GET and POST methods only)
   * @return contentRegularExpression
  **/
  @ApiModelProperty(value = "The content has to match the expression (GET and POST methods only)")
  public String getContentRegularExpression() {
    return contentRegularExpression;
  }

  public void setContentRegularExpression(String contentRegularExpression) {
    this.contentRegularExpression = contentRegularExpression;
  }

  public HealthCheckFullPage contentNegativeRegularExpression(String contentNegativeRegularExpression) {
    this.contentNegativeRegularExpression = contentNegativeRegularExpression;
    return this;
  }

   /**
   * The content cannot match the expression (GET and POST methods only)
   * @return contentNegativeRegularExpression
  **/
  @ApiModelProperty(value = "The content cannot match the expression (GET and POST methods only)")
  public String getContentNegativeRegularExpression() {
    return contentNegativeRegularExpression;
  }

  public void setContentNegativeRegularExpression(String contentNegativeRegularExpression) {
    this.contentNegativeRegularExpression = contentNegativeRegularExpression;
  }

  public HealthCheckFullPage port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port
   * @return port
  **/
  @ApiModelProperty(value = "Port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public HealthCheckFullPage pageTimeout(Integer pageTimeout) {
    this.pageTimeout = pageTimeout;
    return this;
  }

   /**
   * Time limit for the main page body [ms]
   * @return pageTimeout
  **/
  @ApiModelProperty(value = "Time limit for the main page body [ms]")
  public Integer getPageTimeout() {
    return pageTimeout;
  }

  public void setPageTimeout(Integer pageTimeout) {
    this.pageTimeout = pageTimeout;
  }

  public HealthCheckFullPage elementTimeout(Integer elementTimeout) {
    this.elementTimeout = elementTimeout;
    return this;
  }

   /**
   * Time limit for each page elements [ms]
   * @return elementTimeout
  **/
  @ApiModelProperty(value = "Time limit for each page elements [ms]")
  public Integer getElementTimeout() {
    return elementTimeout;
  }

  public void setElementTimeout(Integer elementTimeout) {
    this.elementTimeout = elementTimeout;
  }

  public HealthCheckFullPage elementsTotalTimeout(Integer elementsTotalTimeout) {
    this.elementsTotalTimeout = elementsTotalTimeout;
    return this;
  }

   /**
   * Time limit for all page elements [ms]
   * @return elementsTotalTimeout
  **/
  @ApiModelProperty(value = "Time limit for all page elements [ms]")
  public Integer getElementsTotalTimeout() {
    return elementsTotalTimeout;
  }

  public void setElementsTotalTimeout(Integer elementsTotalTimeout) {
    this.elementsTotalTimeout = elementsTotalTimeout;
  }

  public HealthCheckFullPage fetchPageElements(Boolean fetchPageElements) {
    this.fetchPageElements = fetchPageElements;
    return this;
  }

   /**
   * Fetch page elements
   * @return fetchPageElements
  **/
  @ApiModelProperty(value = "Fetch page elements")
  public Boolean isFetchPageElements() {
    return fetchPageElements;
  }

  public void setFetchPageElements(Boolean fetchPageElements) {
    this.fetchPageElements = fetchPageElements;
  }

  public HealthCheckFullPage maxRedirects(Integer maxRedirects) {
    this.maxRedirects = maxRedirects;
    return this;
  }

   /**
   * Maximum length of HTTP redirects sequence
   * @return maxRedirects
  **/
  @ApiModelProperty(value = "Maximum length of HTTP redirects sequence")
  public Integer getMaxRedirects() {
    return maxRedirects;
  }

  public void setMaxRedirects(Integer maxRedirects) {
    this.maxRedirects = maxRedirects;
  }

  public HealthCheckFullPage maxParallelRequests(Integer maxParallelRequests) {
    this.maxParallelRequests = maxParallelRequests;
    return this;
  }

   /**
   * Maximum number of HTTP requests run in parallel
   * @return maxParallelRequests
  **/
  @ApiModelProperty(value = "Maximum number of HTTP requests run in parallel")
  public Integer getMaxParallelRequests() {
    return maxParallelRequests;
  }

  public void setMaxParallelRequests(Integer maxParallelRequests) {
    this.maxParallelRequests = maxParallelRequests;
  }

  public HealthCheckFullPage generateHar(Boolean generateHar) {
    this.generateHar = generateHar;
    return this;
  }

   /**
   * Generate a HAR file for each check
   * @return generateHar
  **/
  @ApiModelProperty(value = "Generate a HAR file for each check")
  public Boolean isGenerateHar() {
    return generateHar;
  }

  public void setGenerateHar(Boolean generateHar) {
    this.generateHar = generateHar;
  }

  public HealthCheckFullPage allowedElementErrorCount(Integer allowedElementErrorCount) {
    this.allowedElementErrorCount = allowedElementErrorCount;
    return this;
  }

   /**
   * Number of elements that may not be fetched correctly
   * @return allowedElementErrorCount
  **/
  @ApiModelProperty(value = "Number of elements that may not be fetched correctly")
  public Integer getAllowedElementErrorCount() {
    return allowedElementErrorCount;
  }

  public void setAllowedElementErrorCount(Integer allowedElementErrorCount) {
    this.allowedElementErrorCount = allowedElementErrorCount;
  }

  public HealthCheckFullPage contentSizeLimit(Integer contentSizeLimit) {
    this.contentSizeLimit = contentSizeLimit;
    return this;
  }

   /**
   * Content size limit (bytes)
   * @return contentSizeLimit
  **/
  @ApiModelProperty(value = "Content size limit (bytes)")
  public Integer getContentSizeLimit() {
    return contentSizeLimit;
  }

  public void setContentSizeLimit(Integer contentSizeLimit) {
    this.contentSizeLimit = contentSizeLimit;
  }

  public HealthCheckFullPage ignoreHtmlParsingTime(Boolean ignoreHtmlParsingTime) {
    this.ignoreHtmlParsingTime = ignoreHtmlParsingTime;
    return this;
  }

   /**
   * Ignore HTML code processing time in results
   * @return ignoreHtmlParsingTime
  **/
  @ApiModelProperty(value = "Ignore HTML code processing time in results")
  public Boolean isIgnoreHtmlParsingTime() {
    return ignoreHtmlParsingTime;
  }

  public void setIgnoreHtmlParsingTime(Boolean ignoreHtmlParsingTime) {
    this.ignoreHtmlParsingTime = ignoreHtmlParsingTime;
  }

  public HealthCheckFullPage saveCookies(Boolean saveCookies) {
    this.saveCookies = saveCookies;
    return this;
  }

   /**
   * Save cookies between checks
   * @return saveCookies
  **/
  @ApiModelProperty(value = "Save cookies between checks")
  public Boolean isSaveCookies() {
    return saveCookies;
  }

  public void setSaveCookies(Boolean saveCookies) {
    this.saveCookies = saveCookies;
  }

  public HealthCheckFullPage disableContentEncoding(Boolean disableContentEncoding) {
    this.disableContentEncoding = disableContentEncoding;
    return this;
  }

   /**
   * Disable HTTP transfer compression
   * @return disableContentEncoding
  **/
  @ApiModelProperty(value = "Disable HTTP transfer compression")
  public Boolean isDisableContentEncoding() {
    return disableContentEncoding;
  }

  public void setDisableContentEncoding(Boolean disableContentEncoding) {
    this.disableContentEncoding = disableContentEncoding;
  }

  public HealthCheckFullPage content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content
   * @return content
  **/
  @ApiModelProperty(value = "Content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public HealthCheckFullPage contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type
   * @return contentType
  **/
  @ApiModelProperty(value = "Content type")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public HealthCheckFullPage ignoredElementsFilter(String ignoredElementsFilter) {
    this.ignoredElementsFilter = ignoredElementsFilter;
    return this;
  }

   /**
   * Ignore errors for elements with URLs matching the expression (only if page elements are fetched)
   * @return ignoredElementsFilter
  **/
  @ApiModelProperty(value = "Ignore errors for elements with URLs matching the expression (only if page elements are fetched)")
  public String getIgnoredElementsFilter() {
    return ignoredElementsFilter;
  }

  public void setIgnoredElementsFilter(String ignoredElementsFilter) {
    this.ignoredElementsFilter = ignoredElementsFilter;
  }

  public HealthCheckFullPage elementsFilter(String elementsFilter) {
    this.elementsFilter = elementsFilter;
    return this;
  }

   /**
   * Do not fetch elements with URLs that match the expression
   * @return elementsFilter
  **/
  @ApiModelProperty(value = "Do not fetch elements with URLs that match the expression")
  public String getElementsFilter() {
    return elementsFilter;
  }

  public void setElementsFilter(String elementsFilter) {
    this.elementsFilter = elementsFilter;
  }

  public HealthCheckFullPage notificationTypes(List<DictionaryItem> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }

  public HealthCheckFullPage addNotificationTypesItem(DictionaryItem notificationTypesItem) {
    if (this.notificationTypes == null) {
      this.notificationTypes = new ArrayList<DictionaryItem>();
    }
    this.notificationTypes.add(notificationTypesItem);
    return this;
  }

   /**
   * Notification types enabled for a health check
   * @return notificationTypes
  **/
  @ApiModelProperty(value = "Notification types enabled for a health check")
  public List<DictionaryItem> getNotificationTypes() {
    return notificationTypes;
  }

  public void setNotificationTypes(List<DictionaryItem> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }

  public HealthCheckFullPage notificationEventTypes(List<DictionaryItem> notificationEventTypes) {
    this.notificationEventTypes = notificationEventTypes;
    return this;
  }

  public HealthCheckFullPage addNotificationEventTypesItem(DictionaryItem notificationEventTypesItem) {
    if (this.notificationEventTypes == null) {
      this.notificationEventTypes = new ArrayList<DictionaryItem>();
    }
    this.notificationEventTypes.add(notificationEventTypesItem);
    return this;
  }

   /**
   * Event types with enabled notification
   * @return notificationEventTypes
  **/
  @ApiModelProperty(value = "Event types with enabled notification")
  public List<DictionaryItem> getNotificationEventTypes() {
    return notificationEventTypes;
  }

  public void setNotificationEventTypes(List<DictionaryItem> notificationEventTypes) {
    this.notificationEventTypes = notificationEventTypes;
  }

  public HealthCheckFullPage notificationTime(DictionaryItem notificationTime) {
    this.notificationTime = notificationTime;
    return this;
  }

   /**
   * Time when notification is sent
   * @return notificationTime
  **/
  @ApiModelProperty(value = "Time when notification is sent")
  public DictionaryItem getNotificationTime() {
    return notificationTime;
  }

  public void setNotificationTime(DictionaryItem notificationTime) {
    this.notificationTime = notificationTime;
  }

  public HealthCheckFullPage locationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
    return this;
  }

   /**
   * Use random substitute locations in case of location breakdown
   * @return locationsFailoverEnabled
  **/
  @ApiModelProperty(value = "Use random substitute locations in case of location breakdown")
  public Boolean isLocationsFailoverEnabled() {
    return locationsFailoverEnabled;
  }

  public void setLocationsFailoverEnabled(Boolean locationsFailoverEnabled) {
    this.locationsFailoverEnabled = locationsFailoverEnabled;
  }

  public HealthCheckFullPage errorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
    return this;
  }

   /**
   * How many (%) locations have to report an error to consider it a breakdown
   * @return errorTolerance
  **/
  @ApiModelProperty(value = "How many (%) locations have to report an error to consider it a breakdown")
  public Integer getErrorTolerance() {
    return errorTolerance;
  }

  public void setErrorTolerance(Integer errorTolerance) {
    this.errorTolerance = errorTolerance;
  }

  public HealthCheckFullPage id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HealthCheckFullPage interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval
   * @return interval
  **/
  @ApiModelProperty(value = "Interval")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthCheckFullPage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthCheckFullPage address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @ApiModelProperty(value = "Address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HealthCheckFullPage serviceType(DictionaryItem serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Type
   * @return serviceType
  **/
  @ApiModelProperty(value = "Type")
  public DictionaryItem getServiceType() {
    return serviceType;
  }

  public void setServiceType(DictionaryItem serviceType) {
    this.serviceType = serviceType;
  }

  public HealthCheckFullPage state(DictionaryItem state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")
  public DictionaryItem getState() {
    return state;
  }

  public void setState(DictionaryItem state) {
    this.state = state;
  }

  public HealthCheckFullPage detailsLocation(String detailsLocation) {
    this.detailsLocation = detailsLocation;
    return this;
  }

   /**
   * Details url
   * @return detailsLocation
  **/
  @ApiModelProperty(value = "Details url")
  public String getDetailsLocation() {
    return detailsLocation;
  }

  public void setDetailsLocation(String detailsLocation) {
    this.detailsLocation = detailsLocation;
  }

  public HealthCheckFullPage paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Is paused
   * @return paused
  **/
  @ApiModelProperty(value = "Is paused")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public HealthCheckFullPage suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Is suspended
   * @return suspended
  **/
  @ApiModelProperty(value = "Is suspended")
  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public HealthCheckFullPage lastInvalidCheck(OffsetDateTime lastInvalidCheck) {
    this.lastInvalidCheck = lastInvalidCheck;
    return this;
  }

   /**
   * Last invalid check
   * @return lastInvalidCheck
  **/
  @ApiModelProperty(value = "Last invalid check")
  public OffsetDateTime getLastInvalidCheck() {
    return lastInvalidCheck;
  }

  public void setLastInvalidCheck(OffsetDateTime lastInvalidCheck) {
    this.lastInvalidCheck = lastInvalidCheck;
  }

  public HealthCheckFullPage lastValidCheck(OffsetDateTime lastValidCheck) {
    this.lastValidCheck = lastValidCheck;
    return this;
  }

   /**
   * Last valid check
   * @return lastValidCheck
  **/
  @ApiModelProperty(value = "Last valid check")
  public OffsetDateTime getLastValidCheck() {
    return lastValidCheck;
  }

  public void setLastValidCheck(OffsetDateTime lastValidCheck) {
    this.lastValidCheck = lastValidCheck;
  }

    public HealthCheckFullPage description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckFullPage healthCheckFullPage = (HealthCheckFullPage) o;
    return Objects.equals(this.httpMethod, healthCheckFullPage.httpMethod) &&
        Objects.equals(this.contentRegularExpression, healthCheckFullPage.contentRegularExpression) &&
        Objects.equals(this.contentNegativeRegularExpression, healthCheckFullPage.contentNegativeRegularExpression) &&
        Objects.equals(this.port, healthCheckFullPage.port) &&
        Objects.equals(this.pageTimeout, healthCheckFullPage.pageTimeout) &&
        Objects.equals(this.elementTimeout, healthCheckFullPage.elementTimeout) &&
        Objects.equals(this.elementsTotalTimeout, healthCheckFullPage.elementsTotalTimeout) &&
        Objects.equals(this.fetchPageElements, healthCheckFullPage.fetchPageElements) &&
        Objects.equals(this.maxRedirects, healthCheckFullPage.maxRedirects) &&
        Objects.equals(this.maxParallelRequests, healthCheckFullPage.maxParallelRequests) &&
        Objects.equals(this.generateHar, healthCheckFullPage.generateHar) &&
        Objects.equals(this.allowedElementErrorCount, healthCheckFullPage.allowedElementErrorCount) &&
        Objects.equals(this.contentSizeLimit, healthCheckFullPage.contentSizeLimit) &&
        Objects.equals(this.ignoreHtmlParsingTime, healthCheckFullPage.ignoreHtmlParsingTime) &&
        Objects.equals(this.saveCookies, healthCheckFullPage.saveCookies) &&
        Objects.equals(this.disableContentEncoding, healthCheckFullPage.disableContentEncoding) &&
        Objects.equals(this.content, healthCheckFullPage.content) &&
        Objects.equals(this.contentType, healthCheckFullPage.contentType) &&
        Objects.equals(this.ignoredElementsFilter, healthCheckFullPage.ignoredElementsFilter) &&
        Objects.equals(this.elementsFilter, healthCheckFullPage.elementsFilter) &&
        Objects.equals(this.notificationTypes, healthCheckFullPage.notificationTypes) &&
        Objects.equals(this.notificationEventTypes, healthCheckFullPage.notificationEventTypes) &&
        Objects.equals(this.notificationTime, healthCheckFullPage.notificationTime) &&
        Objects.equals(this.locationsFailoverEnabled, healthCheckFullPage.locationsFailoverEnabled) &&
        Objects.equals(this.errorTolerance, healthCheckFullPage.errorTolerance) &&
        Objects.equals(this.id, healthCheckFullPage.id) &&
        Objects.equals(this.interval, healthCheckFullPage.interval) &&
        Objects.equals(this.name, healthCheckFullPage.name) &&
        Objects.equals(this.address, healthCheckFullPage.address) &&
        Objects.equals(this.serviceType, healthCheckFullPage.serviceType) &&
        Objects.equals(this.state, healthCheckFullPage.state) &&
        Objects.equals(this.detailsLocation, healthCheckFullPage.detailsLocation) &&
        Objects.equals(this.paused, healthCheckFullPage.paused) &&
        Objects.equals(this.suspended, healthCheckFullPage.suspended) &&
        Objects.equals(this.lastInvalidCheck, healthCheckFullPage.lastInvalidCheck) &&
            Objects.equals(this.lastValidCheck, healthCheckFullPage.lastValidCheck) &&
            Objects.equals(this.description, healthCheckFullPage.description);
  }

  @Override
  public int hashCode() {
      return Objects.hash(httpMethod, contentRegularExpression, contentNegativeRegularExpression, port, pageTimeout, elementTimeout, elementsTotalTimeout, fetchPageElements, maxRedirects, maxParallelRequests, generateHar, allowedElementErrorCount, contentSizeLimit, ignoreHtmlParsingTime, saveCookies, disableContentEncoding, content, contentType, ignoredElementsFilter, elementsFilter, notificationTypes, notificationEventTypes, notificationTime, locationsFailoverEnabled, errorTolerance, id, interval, name, address, serviceType, state, detailsLocation, paused, suspended, lastInvalidCheck, lastValidCheck, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckFullPage {\n");

    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    contentRegularExpression: ").append(toIndentedString(contentRegularExpression)).append("\n");
    sb.append("    contentNegativeRegularExpression: ").append(toIndentedString(contentNegativeRegularExpression)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    pageTimeout: ").append(toIndentedString(pageTimeout)).append("\n");
    sb.append("    elementTimeout: ").append(toIndentedString(elementTimeout)).append("\n");
    sb.append("    elementsTotalTimeout: ").append(toIndentedString(elementsTotalTimeout)).append("\n");
    sb.append("    fetchPageElements: ").append(toIndentedString(fetchPageElements)).append("\n");
    sb.append("    maxRedirects: ").append(toIndentedString(maxRedirects)).append("\n");
    sb.append("    maxParallelRequests: ").append(toIndentedString(maxParallelRequests)).append("\n");
    sb.append("    generateHar: ").append(toIndentedString(generateHar)).append("\n");
    sb.append("    allowedElementErrorCount: ").append(toIndentedString(allowedElementErrorCount)).append("\n");
    sb.append("    contentSizeLimit: ").append(toIndentedString(contentSizeLimit)).append("\n");
    sb.append("    ignoreHtmlParsingTime: ").append(toIndentedString(ignoreHtmlParsingTime)).append("\n");
    sb.append("    saveCookies: ").append(toIndentedString(saveCookies)).append("\n");
    sb.append("    disableContentEncoding: ").append(toIndentedString(disableContentEncoding)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    ignoredElementsFilter: ").append(toIndentedString(ignoredElementsFilter)).append("\n");
    sb.append("    elementsFilter: ").append(toIndentedString(elementsFilter)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    notificationEventTypes: ").append(toIndentedString(notificationEventTypes)).append("\n");
    sb.append("    notificationTime: ").append(toIndentedString(notificationTime)).append("\n");
    sb.append("    locationsFailoverEnabled: ").append(toIndentedString(locationsFailoverEnabled)).append("\n");
    sb.append("    errorTolerance: ").append(toIndentedString(errorTolerance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    detailsLocation: ").append(toIndentedString(detailsLocation)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    lastInvalidCheck: ").append(toIndentedString(lastInvalidCheck)).append("\n");
    sb.append("    lastValidCheck: ").append(toIndentedString(lastValidCheck)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
