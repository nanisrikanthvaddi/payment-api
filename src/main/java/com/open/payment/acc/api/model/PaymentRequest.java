package com.open.payment.acc.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-20T19:05:40.251343300+08:00[Asia/Singapore]")
public class PaymentRequest   {
  @JsonProperty("payment-id")
  private Long paymentId;

  @JsonProperty("client-id")
  private String clientId;

  @JsonProperty("client-name")
  private String clientName;

  @JsonProperty("b2b-id")
  private String b2bId;

  @JsonProperty("gst-no")
  private String gstNo;

  @JsonProperty("debit-account-number")
  private String debitAccountNumber;

  @JsonProperty("payment-type")
  private String paymentType;

  @JsonProperty("payment-instructions-list")
  @Valid
  private List<Payment> paymentInstructionsList = null;

  public PaymentRequest paymentId(Long paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  */
  @ApiModelProperty(value = "")


  public Long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Long paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  @ApiModelProperty(value = "")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public PaymentRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
  */
  @ApiModelProperty(value = "")


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public PaymentRequest b2bId(String b2bId) {
    this.b2bId = b2bId;
    return this;
  }

  /**
   * Get b2bId
   * @return b2bId
  */
  @ApiModelProperty(value = "")


  public String getB2bId() {
    return b2bId;
  }

  public void setB2bId(String b2bId) {
    this.b2bId = b2bId;
  }

  public PaymentRequest gstNo(String gstNo) {
    this.gstNo = gstNo;
    return this;
  }

  /**
   * Get gstNo
   * @return gstNo
  */
  @ApiModelProperty(value = "")


  public String getGstNo() {
    return gstNo;
  }

  public void setGstNo(String gstNo) {
    this.gstNo = gstNo;
  }

  public PaymentRequest debitAccountNumber(String debitAccountNumber) {
    this.debitAccountNumber = debitAccountNumber;
    return this;
  }

  /**
   * Get debitAccountNumber
   * @return debitAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getDebitAccountNumber() {
    return debitAccountNumber;
  }

  public void setDebitAccountNumber(String debitAccountNumber) {
    this.debitAccountNumber = debitAccountNumber;
  }

  public PaymentRequest paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentRequest paymentInstructionsList(List<Payment> paymentInstructionsList) {
    this.paymentInstructionsList = paymentInstructionsList;
    return this;
  }

  public PaymentRequest addPaymentInstructionsListItem(Payment paymentInstructionsListItem) {
    if (this.paymentInstructionsList == null) {
      this.paymentInstructionsList = new ArrayList<>();
    }
    this.paymentInstructionsList.add(paymentInstructionsListItem);
    return this;
  }

  /**
   * Get paymentInstructionsList
   * @return paymentInstructionsList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Payment> getPaymentInstructionsList() {
    return paymentInstructionsList;
  }

  public void setPaymentInstructionsList(List<Payment> paymentInstructionsList) {
    this.paymentInstructionsList = paymentInstructionsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.paymentId, paymentRequest.paymentId) &&
        Objects.equals(this.clientId, paymentRequest.clientId) &&
        Objects.equals(this.clientName, paymentRequest.clientName) &&
        Objects.equals(this.b2bId, paymentRequest.b2bId) &&
        Objects.equals(this.gstNo, paymentRequest.gstNo) &&
        Objects.equals(this.debitAccountNumber, paymentRequest.debitAccountNumber) &&
        Objects.equals(this.paymentType, paymentRequest.paymentType) &&
        Objects.equals(this.paymentInstructionsList, paymentRequest.paymentInstructionsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, clientId, clientName, b2bId, gstNo, debitAccountNumber, paymentType, paymentInstructionsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    b2bId: ").append(toIndentedString(b2bId)).append("\n");
    sb.append("    gstNo: ").append(toIndentedString(gstNo)).append("\n");
    sb.append("    debitAccountNumber: ").append(toIndentedString(debitAccountNumber)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentInstructionsList: ").append(toIndentedString(paymentInstructionsList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

