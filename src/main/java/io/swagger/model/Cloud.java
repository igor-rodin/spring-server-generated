package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cloud
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-31T16:57:09.985Z[GMT]")


public class Cloud   {
  @JsonProperty("cloud_id")
  private Integer cloudId = null;

  /**
   * Операционная система сервера
   */
  public enum OSEnum {
    WINDOWS("Windows"),
    
    LINUX("Linux");

    private String value;

    OSEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OSEnum fromValue(String text) {
      for (OSEnum b : OSEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("OS")
  private OSEnum OS = null;

  @JsonProperty("CPU")
  private Integer CPU = null;

  @JsonProperty("RAM")
  private Integer RAM = null;

  @JsonProperty("HDD")
  private Integer HDD = null;

  @JsonProperty("duration")
  private Integer duration = null;

  public Cloud cloudId(Integer cloudId) {
    this.cloudId = cloudId;
    return this;
  }

  /**
   * Id ресурса
   * minimum: 1
   * @return cloudId
   **/
  @Schema(example = "134", required = true, description = "Id ресурса")
      @NotNull

  @Min(1)  public Integer getCloudId() {
    return cloudId;
  }

  public void setCloudId(Integer cloudId) {
    this.cloudId = cloudId;
  }

  public Cloud OS(OSEnum OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Операционная система сервера
   * @return OS
   **/
  @Schema(required = true, description = "Операционная система сервера")
      @NotNull

    public OSEnum getOS() {
    return OS;
  }

  public void setOS(OSEnum OS) {
    this.OS = OS;
  }

  public Cloud CPU(Integer CPU) {
    this.CPU = CPU;
    return this;
  }

  /**
   * Количество ядер процессора
   * minimum: 1
   * @return CPU
   **/
  @Schema(example = "4", required = true, description = "Количество ядер процессора")
      @NotNull

  @Min(1)  public Integer getCPU() {
    return CPU;
  }

  public void setCPU(Integer CPU) {
    this.CPU = CPU;
  }

  public Cloud RAM(Integer RAM) {
    this.RAM = RAM;
    return this;
  }

  /**
   * Доступная оперативная память, Гбт
   * minimum: 1
   * @return RAM
   **/
  @Schema(example = "16", required = true, description = "Доступная оперативная память, Гбт")
      @NotNull

  @Min(1)  public Integer getRAM() {
    return RAM;
  }

  public void setRAM(Integer RAM) {
    this.RAM = RAM;
  }

  public Cloud HDD(Integer HDD) {
    this.HDD = HDD;
    return this;
  }

  /**
   * Доступная память жесткого диска, Мбт
   * minimum: 512
   * @return HDD
   **/
  @Schema(example = "1024", required = true, description = "Доступная память жесткого диска, Мбт")
      @NotNull

  @Min(512)  public Integer getHDD() {
    return HDD;
  }

  public void setHDD(Integer HDD) {
    this.HDD = HDD;
  }

  public Cloud duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Длительность аренды в месяцах
   * minimum: 1
   * @return duration
   **/
  @Schema(example = "3", required = true, description = "Длительность аренды в месяцах")
      @NotNull

  @Min(1)  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.cloudId, cloud.cloudId) &&
        Objects.equals(this.OS, cloud.OS) &&
        Objects.equals(this.CPU, cloud.CPU) &&
        Objects.equals(this.RAM, cloud.RAM) &&
        Objects.equals(this.HDD, cloud.HDD) &&
        Objects.equals(this.duration, cloud.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, OS, CPU, RAM, HDD, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    CPU: ").append(toIndentedString(CPU)).append("\n");
    sb.append("    RAM: ").append(toIndentedString(RAM)).append("\n");
    sb.append("    HDD: ").append(toIndentedString(HDD)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
