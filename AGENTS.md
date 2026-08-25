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

## Design guide

Soc Ops uses a Cyberpunk Neon visual language: a dark terminal/arcade console with sharp geometry, electric cyan signals, acid-lime success states, and hot coral victory states. The interface should feel energetic and social without sacrificing scanability or contrast.

- Keep the existing dependency-free Thymeleaf and static CSS approach for frontend changes.
- Define reusable colors, shadows, and spacing as CSS variables in [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css).
- Use layered CSS-only atmosphere such as subtle grid lines, scanlines, panel borders, and restrained glow. Avoid decorative effects that compete with prompts or controls.
- Preserve stable dimensions for the 5x5 board and tiles. Prompt text must wrap without shifting the grid or causing horizontal overflow on mobile.
- Give interactive states clear visual differences: open, hover, focus-visible, selected, winning, and free-space tiles must remain readable against the dark background.
- Keep keyboard focus visible and support `prefers-reduced-motion` for animations and transitions.
- Preserve the frontend contracts in [socops/src/main/resources/templates/game.html](socops/src/main/resources/templates/game.html): required DOM IDs, global game handlers, `aria-pressed`, the center free cell, and the `socops-bingo-snapshot` localStorage format.
- Validate UI changes at desktop and narrow mobile widths, including lobby launch, tile selection, victory feedback, modal dismissal, return to lobby, and reload persistence.
