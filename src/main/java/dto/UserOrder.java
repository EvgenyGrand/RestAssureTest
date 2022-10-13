package dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;



public @Data @Builder class UserOrder {

    @Getter
    @Setter
    private Boolean complete;
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;



}