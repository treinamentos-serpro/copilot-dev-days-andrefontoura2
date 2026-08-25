<div align="center">

# 🎯 Soc Ops

### _Social Bingo for In-Person Mixers_

[![Java 21](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-green?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![GitHub Copilot](https://img.shields.io/badge/GitHub%20Copilot-Workshop-8250df?logo=github)](https://github.com/features/copilot)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**Find people who match the questions. Get 5 in a row. Win!**

[🚀 Start the Lab](workshop/00-overview.md) · [📖 Read the Guide](workshop/GUIDE.md) · [🌐 Português](README.pt_BR.md) · [🌐 Español](README.es.md)

</div>

---

## ✨ What is Soc Ops?

Soc Ops is a **hands-on workshop project** built on a Social Bingo game — and your mission is to make it amazing using **GitHub Copilot Agent Mode** in VS Code.

Over ~1 hour, you'll use AI-driven workflows to redesign the UI, extend the game with new features, and experience what modern agentic development feels like end-to-end.

> 💡 **No prior AI tooling experience required.** Just bring curiosity and a love of bingo.

---

## 🗺️ Lab Roadmap

| Part | Title | What you'll do |
|:----:|-------|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | Orient yourself and verify prerequisites |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | Clone, configure, and teach the AI about your project |
| [**02**](workshop/02-design.md) | Design-First Frontend | Redesign the UI with creative themes using AI |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | Create your own quiz themes with custom agents |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | Build new features with TDD and design agents |

> 📁 All guides are available offline in the [`workshop/`](workshop/) folder.

---

## 🎓 What You'll Learn

- **Context Engineering** — teach AI about your codebase using instructions and custom agents
- **Agentic Primitives** — run background agents, cloud agents, and custom agent workflows
- **Design-First Development** — let AI iterate on UI while you guide the creative vision
- **Test-Driven Development** — use TDD agents to build reliable features with confidence

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Runtime | Java 21 |
| Framework | Spring Boot 3.4 |
| Build | Apache Maven 3.9 (wrapper included) |
| Templates | Thymeleaf |
| Styles | Custom CSS utilities |

---

## ⚡ Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Git](https://git-scm.com/)

```bash
# Run the app
cd socops && ./mvnw spring-boot:run

# Run tests
cd socops && ./mvnw test

# Build (includes Checkstyle validation)
cd socops && ./mvnw clean package
```

Open [http://localhost:8080](http://localhost:8080) and you're live. 🎉

> 🐳 Prefer a zero-setup start? Open in a **[Dev Container](.devcontainer)** for a fully pre-configured environment.

---

## 🤝 Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) before submitting a pull request.

---

<div align="center">

Deploys automatically to GitHub Pages on push to `main`.

Made with ☕ and 🤖 · [Code of Conduct](CODE_OF_CONDUCT.md) · [Security](SECURITY.md)

</div>
