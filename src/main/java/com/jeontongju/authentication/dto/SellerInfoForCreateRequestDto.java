package com.jeontongju.authentication.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class SellerInfoForCreateRequestDto {

  private Long memberId;
  private String email;
  private String storeName;
  private String storeDescription;
  private String storeImageUrl;
  private String storePhoneNumber;
  private String businessmanName;
  private String businessmanPhoneNumber;

  public static SellerInfoForCreateRequestDto toDto(
      Long memberId,
      SellerInfoForSignUpRequestDto signUpRequestDto,
      ImpAuthInfoResponse impAuthInfoResponse) {
    return SellerInfoForCreateRequestDto.builder()
        .memberId(memberId)
        .email(signUpRequestDto.getEmail())
        .storeName(signUpRequestDto.getStoreName())
        .storeDescription(signUpRequestDto.getStoreDescription())
        .storeImageUrl(signUpRequestDto.getStoreImageUrl())
        .storePhoneNumber(signUpRequestDto.getStorePhoneNumber())
        .businessmanName(impAuthInfoResponse.getName())
        .businessmanPhoneNumber(impAuthInfoResponse.getPhone())
        .build();
  }
}
