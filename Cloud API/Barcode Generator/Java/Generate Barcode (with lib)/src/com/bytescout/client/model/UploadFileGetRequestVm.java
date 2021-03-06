package com.bytescout.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-13T18:55:29.062+06:00")
public class UploadFileGetRequestVm   {
  
  private Integer storageTime = null;


  public enum OutputTypeEnum {
    LINK("link"),
    LINKPRIVATE("linkPrivate"),
    CONTENT("content"),
    CONTENTBASE64("contentBase64"),
    FILEID("fileId");

    private String value;

    OutputTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OutputTypeEnum outputType = null;
  private String input = null;


  public enum InputTypeEnum {
    AUTO("auto"),
    VALUE("value"),
    VALUEBASE64("valueBase64"),
    LINK("link"),
    FILEID("fileID");

    private String value;

    InputTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private InputTypeEnum inputType = null;

  
  /**
   * Time of storing of a file on server (seconds) (optional).\r\n            Default value: 1800
   **/
  public UploadFileGetRequestVm storageTime(Integer storageTime) {
    this.storageTime = storageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time of storing of a file on server (seconds) (optional).\r\n            Default value: 1800")
  @JsonProperty("storageTime")
  public Integer getStorageTime() {
    return storageTime;
  }
  public void setStorageTime(Integer storageTime) {
    this.storageTime = storageTime;
  }

  
  /**
   * Type in which you want to get result of extracting (optional). Default value: Content. \r\n            IMPORTANT: \r\n            Link type generates public unique link to download, file is removed after default StorageTime(see File API). \r\n            LinkPrivate generates private unique link which should NOT be shared as it can be accessed with your api key only!
   **/
  public UploadFileGetRequestVm outputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type in which you want to get result of extracting (optional). Default value: Content. \r\n            IMPORTANT: \r\n            Link type generates public unique link to download, file is removed after default StorageTime(see File API). \r\n            LinkPrivate generates private unique link which should NOT be shared as it can be accessed with your api key only!")
  @JsonProperty("outputType")
  public OutputTypeEnum getOutputType() {
    return outputType;
  }
  public void setOutputType(OutputTypeEnum outputType) {
    this.outputType = outputType;
  }

  
  /**
   * Input Data
   **/
  public UploadFileGetRequestVm input(String input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input Data")
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  
  /**
   * Type of Input Data
   **/
  public UploadFileGetRequestVm inputType(InputTypeEnum inputType) {
    this.inputType = inputType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of Input Data")
  @JsonProperty("inputType")
  public InputTypeEnum getInputType() {
    return inputType;
  }
  public void setInputType(InputTypeEnum inputType) {
    this.inputType = inputType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileGetRequestVm uploadFileGetRequestVm = (UploadFileGetRequestVm) o;
    return Objects.equals(this.storageTime, uploadFileGetRequestVm.storageTime) &&
        Objects.equals(this.outputType, uploadFileGetRequestVm.outputType) &&
        Objects.equals(this.input, uploadFileGetRequestVm.input) &&
        Objects.equals(this.inputType, uploadFileGetRequestVm.inputType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageTime, outputType, input, inputType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileGetRequestVm {\n");
    
    sb.append("    storageTime: ").append(toIndentedString(storageTime)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
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

