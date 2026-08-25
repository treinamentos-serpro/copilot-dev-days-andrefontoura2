# AGENTS.md

## Mandatory development checklist

- [ ] Lint/static checks: run the project’s configured lint or static analysis task before finishing work.
- [ ] Build: `cd socops && ./mvnw clean package`
- [ ] Test: `cd socops && ./mvnw test`

## Project snapshot

This is a Spring Boot app for Soc Ops, a social bingo game for in-person mixers. Keep game rules and win logic in pure Java helpers under [socops/src/main/java/com/socops](socops/src/main/java/com/socops), with UI and web concerns kept separate.

## Quick start

- Run app: `cd socops && ./mvnw spring-boot:run`
- Test: `cd socops && ./mvnw test`
- Build: `cd socops && ./mvnw clean package`

## Useful references

- [README.md](README.md)
- [workshop/GUIDE.md](workshop/GUIDE.md)
- [socops/pom.xml](socops/pom.xml)
- [socops/src/main/java/com/socops/service/BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java)
- [socops/src/test/java/com/socops/service/BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java)

## Working conventions

- Use Java 21 features only when they fit the existing style.
- Keep changes small and focused; add or update matching tests for logic changes.
- Preserve the package structure and naming under [socops/src/main/java/com/socops](socops/src/main/java/com/socops).
- Prefer deterministic logic and lightweight Thymeleaf/static CSS updates for UI changes.
- Link to existing docs instead of duplicating them.
