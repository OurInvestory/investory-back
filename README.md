# 📈 Investory Backend

## 🛠 기술 스택

- **Language**: Java 17
- **Framework**: Spring Boot 3.5.6
- **Database**: MySQL 8.0, Redis 7
- **Security**: Spring Security
- **Documentation**: Swagger/OpenAPI 3
- **Build Tool**: Gradle 8.14.3
- **Containerization**: Docker & Docker Compose

## 🚀 빠른 시작

### 1. 환경 변수 설정
```bash
cp .env.example .env
```

### 2. 서비스 실행
```bash
# MySQL + Redis + Backend
docker-compose up -d

# 또는 개발 환경에서
./gradlew bootRun
```

### 3. API 문서 확인
- Swagger UI: http://localhost:8080/swagger-ui.html
- Health Check: http://localhost:8080/actuator/health