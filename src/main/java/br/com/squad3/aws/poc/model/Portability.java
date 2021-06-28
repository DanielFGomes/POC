package br.com.squad3.aws.poc.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ToString
@Getter
@Setter
@Builder
@DynamoDBTable(tableName = "Portability")
public class Portability {
    @DynamoDBHashKey(attributeName="portabilityNumber")
    private String portabilityNumber;

    @DynamoDBAttribute(attributeName="fullname")
    private String fullname;

    @DynamoDBAttribute(attributeName="contractValue")
    private BigDecimal contractValue;

    @DynamoDBAttribute(attributeName="interestRate")
    private BigDecimal interestRate;

    @DynamoDBAttribute(attributeName="amountInstallments")
    private Integer amountInstallments;

    @DynamoDBAttribute(attributeName="dueDate")
    private Date dueDate;

    @DynamoDBAttribute(attributeName="addresses")
    private List<Address> addresses;
}
