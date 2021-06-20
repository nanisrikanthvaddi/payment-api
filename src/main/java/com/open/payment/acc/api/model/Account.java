package com.open.payment.acc.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-20T19:05:40.251343300+08:00[Asia/Singapore]")
public class Account   {
  @JsonProperty("account-number")
  private String accountNumber;

  @JsonProperty("beneficiary-name")
  private String beneficiaryName;

  @JsonProperty("account-type")
  private String accountType;

  @JsonProperty("mobile-number")
  private String mobileNumber;

  @JsonProperty("country-code")
  private String countryCode;

  @JsonProperty("bank-name")
  private String bankName;

  @JsonProperty("bank-branch")
  private String bankBranch;

  @JsonProperty("bank-branch-code")
  private String bankBranchCode;

  @JsonProperty("swift-code")
  private String swiftCode;

  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  /**
   * Get beneficiaryName
   * @return beneficiaryName
  */
  @ApiModelProperty(value = "")


  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  */
  @ApiModelProperty(value = "")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Account countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Account bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  */
  @ApiModelProperty(value = "")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Account bankBranch(String bankBranch) {
    this.bankBranch = bankBranch;
    return this;
  }

  /**
   * Get bankBranch
   * @return bankBranch
  */
  @ApiModelProperty(value = "")


  public String getBankBranch() {
    return bankBranch;
  }

  public void setBankBranch(String bankBranch) {
    this.bankBranch = bankBranch;
  }

  public Account bankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
    return this;
  }

  /**
   * Get bankBranchCode
   * @return bankBranchCode
  */
  @ApiModelProperty(value = "")


  public String getBankBranchCode() {
    return bankBranchCode;
  }

  public void setBankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
  }

  public Account swiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
    return this;
  }

  /**
   * Get swiftCode
   * @return swiftCode
  */
  @ApiModelProperty(value = "")


  public String getSwiftCode() {
    return swiftCode;
  }

  public void setSwiftCode(String swiftCode) {
    this.swiftCode = swiftCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.beneficiaryName, account.beneficiaryName) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.mobileNumber, account.mobileNumber) &&
        Objects.equals(this.countryCode, account.countryCode) &&
        Objects.equals(this.bankName, account.bankName) &&
        Objects.equals(this.bankBranch, account.bankBranch) &&
        Objects.equals(this.bankBranchCode, account.bankBranchCode) &&
        Objects.equals(this.swiftCode, account.swiftCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, beneficiaryName, accountType, mobileNumber, countryCode, bankName, bankBranch, bankBranchCode, swiftCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBranch: ").append(toIndentedString(bankBranch)).append("\n");
    sb.append("    bankBranchCode: ").append(toIndentedString(bankBranchCode)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
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

