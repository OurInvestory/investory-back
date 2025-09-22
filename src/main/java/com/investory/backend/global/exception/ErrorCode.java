package com.investory.backend.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE("C001", "잘못된 입력값입니다.", HttpStatus.BAD_REQUEST),
    METHOD_NOT_ALLOWED("C002", "허용되지 않은 HTTP 메서드입니다.", HttpStatus.METHOD_NOT_ALLOWED),
    INTERNAL_SERVER_ERROR("C003", "서버 내부 오류가 발생했습니다.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_TYPE_VALUE("C004", "잘못된 타입 값입니다.", HttpStatus.BAD_REQUEST),
    ENTITY_NOT_FOUND("C005", "엔티티를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    ACCESS_DENIED("C006", "접근 권한이 없습니다.", HttpStatus.FORBIDDEN),

    // Authentication & Authorization
    AUTHENTICATION_FAILED("A001", "인증에 실패했습니다.", HttpStatus.UNAUTHORIZED),
    AUTHORIZATION_FAILED("A002", "권한이 없습니다.", HttpStatus.FORBIDDEN),
    TOKEN_EXPIRED("A003", "토큰이 만료되었습니다.", HttpStatus.UNAUTHORIZED),
    TOKEN_INVALID("A004", "유효하지 않은 토큰입니다.", HttpStatus.UNAUTHORIZED),
    TOKEN_NOT_FOUND("A005", "토큰을 찾을 수 없습니다.", HttpStatus.UNAUTHORIZED),

    // User
    USER_NOT_FOUND("U001", "사용자를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    EMAIL_ALREADY_EXISTS("U002", "이미 존재하는 이메일입니다.", HttpStatus.CONFLICT),
    USER_ALREADY_EXISTS("U003", "이미 존재하는 사용자입니다.", HttpStatus.CONFLICT),
    INVALID_PASSWORD("U004", "잘못된 비밀번호입니다.", HttpStatus.BAD_REQUEST),
    USER_DISABLED("U005", "비활성화된 사용자입니다.", HttpStatus.FORBIDDEN),

    // Stock
    STOCK_NOT_FOUND("S001", "주식을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    STOCK_PRICE_NOT_AVAILABLE("S002", "주식 가격 정보를 사용할 수 없습니다.", HttpStatus.SERVICE_UNAVAILABLE),
    MARKET_CLOSED("S003", "시장이 닫혀있습니다.", HttpStatus.BAD_REQUEST),

    // Trading
    INSUFFICIENT_BALANCE("T001", "잔액이 부족합니다.", HttpStatus.BAD_REQUEST),
    INSUFFICIENT_SHARES("T002", "보유 주식이 부족합니다.", HttpStatus.BAD_REQUEST),
    INVALID_ORDER_QUANTITY("T003", "잘못된 주문 수량입니다.", HttpStatus.BAD_REQUEST),
    INVALID_ORDER_PRICE("T004", "잘못된 주문 가격입니다.", HttpStatus.BAD_REQUEST),
    ORDER_NOT_FOUND("T005", "주문을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    ORDER_ALREADY_EXECUTED("T006", "이미 체결된 주문입니다.", HttpStatus.CONFLICT),
    ORDER_ALREADY_CANCELLED("T007", "이미 취소된 주문입니다.", HttpStatus.CONFLICT),

    // Portfolio
    PORTFOLIO_NOT_FOUND("P001", "포트폴리오를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    HOLDING_NOT_FOUND("P002", "보유 종목을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),

    // Gamification
    ACHIEVEMENT_NOT_FOUND("G001", "업적을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    ACHIEVEMENT_ALREADY_EARNED("G002", "이미 획득한 업적입니다.", HttpStatus.CONFLICT),
    INSUFFICIENT_POINTS("G003", "포인트가 부족합니다.", HttpStatus.BAD_REQUEST),

    // Notification
    NOTIFICATION_NOT_FOUND("N001", "알림을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    NOTIFICATION_ALREADY_READ("N002", "이미 읽은 알림입니다.", HttpStatus.CONFLICT);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;
}