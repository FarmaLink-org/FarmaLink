# 💊 FarmaLink

### Integrated Pharmacy & Corporate Benefits Management Platform

<p align="center">
  <strong>Connecting pharmacies, companies, and employees through smarter benefit management.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Project-FarmaLink-0B6E69?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Architecture-Microservices-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-In%20Development-orange?style=for-the-badge" />
</p>

---

## 📌 Overview

**FarmaLink** is a multiplatform platform designed to connect pharmacies and companies through a centralized ecosystem for managing employee pharmacy benefits.

The system streamlines the administration of company-pharmacy agreements, employee registrations, benefit quotas, product consumption, and monthly payroll reconciliation.

By integrating business processes, automation, and centralized information management, FarmaLink aims to improve operational efficiency, transparency, and traceability across participating organizations.

## 🎯 Core Features

| Feature | Description |
|---|---|
| 🏢 Organization Management | Manage companies, pharmacies, and branches. |
| 🤝 Agreements | Establish and manage company-pharmacy agreements. |
| 👥 Employee Management | Register, update, and manage employee information. |
| 💳 Benefit Quotas | Configure and monitor employee pharmacy allowances. |
| 🛒 Consumption Tracking | Validate and record pharmacy product consumption. |
| 📊 Payroll Reconciliation | Generate monthly consumption summaries and payroll reports. |
| 🔔 Notifications | Send relevant updates and automated alerts. |
| ⚙️ Process Automation | Streamline repetitive business operations. |
| 🔐 Access Control | Manage permissions through role-based access control (RBAC). |
| 📈 Analytics | Provide reports and business insights. |

## 🏗️ System Architecture

FarmaLink follows a **microservices-oriented architecture**, organizing business capabilities into independent services while providing multiple interfaces through a shared backend ecosystem.

### Applications

| Platform | Technology |
|---|---|
| 🌐 Web | React + TypeScript |
| 📱 Mobile | React + Capacitor |
| 🖥️ Desktop | React + Electron |

### Backend Technologies

- Java
- Spring Boot
- Gradle
- REST APIs
- Microservices Architecture

### Cloud Infrastructure & DevOps

- ☁️ AWS Academy Learner Lab
- Terraform (Infrastructure as Code)
- Docker (Containerization)
- Amazon ECR (Container Registry)
- Amazon ECS (Container Orchestration)
- GitHub Actions (CI/CD)
- AWS CodeDeploy (Deployment, subject to service availability and permissions)

### Automation & Quality Assurance

- n8n – Workflow automation.
- Postman – API development and testing.
- Unit, integration, and functional testing.
- Load and performance testing.
- Frontend end-to-end testing.

## 🧩 Microservices

The backend is organized into the following planned business services:

| # | Service | Responsibility |
|---|---|---|
| 01 | Identity | Authentication, authorization, and user management. |
| 02 | Organization | Company, pharmacy, and branch management. |
| 03 | Agreement | Management of business agreements. |
| 04 | Workforce | Employee registration and administration. |
| 05 | Catalog | Pharmacy product catalog management. |
| 06 | Consumption | Employee benefit consumption tracking. |
| 07 | Reconciliation | Monthly consumption and payroll reconciliation. |
| 08 | Campaign | Promotional campaigns and benefit initiatives. |
| 09 | Notification | Notifications and automated communications. |
| 10 | Analytics | Reports, statistics, and business intelligence. |
| 11 | Integration | External systems and third-party integrations. |

## 📁 Repository Structure

The project follows a monorepo structure to organize applications, backend services, infrastructure, automation, testing, and documentation.

```text
FarmaLink/
│
├── apps/
│   ├── web/                  # Web application
│   ├── mobile/               # Mobile application
│   └── desktop/              # Desktop application
│
├── services/
│   ├── identity/
│   ├── organization/
│   ├── agreement/
│   ├── workforce/
│   ├── catalog/
│   ├── consumption/
│   ├── reconciliation/
│   ├── campaign/
│   ├── notification/
│   ├── analytics/
│   └── integration/
│
├── infrastructure/
│   └── terraform/            # Infrastructure as Code
│
├── automation/
│   └── n8n/                  # Automated workflows
│
├── tests/                    # Testing resources
│
├── postman/                  # API collections
│
└── docs/                     # Technical documentation
```

## ☁️ Deployment Environments

The infrastructure is designed to support two environments:

| Environment | Purpose |
|---|---|
| 🧪 QA | Testing, validation, and quality assurance. |
| 🚀 Production | Deployment of the stable application. |

**Infrastructure considerations:** Actual AWS deployment depends on the services, permissions, quotas, and resource limits available in the institutional AWS Academy Learner Lab.

## 🔄 Development Workflow

FarmaLink uses Git and GitHub to manage source code, collaboration, and version control.

### Branching Strategy

| Branch | Purpose |
|---|---|
| `main` | Stable and integrated code. |
| `qa` | Quality assurance and validation. |
| `feature/*` | Development of new features. |

### Development Standards

- **Git & GitHub:** Source code management and collaboration.
- **Pull Requests:** Code review and controlled integration.
- **Conventional Commits:** Consistent and descriptive commit messages.
- **Incremental Development:** Implementation and integration of components in stages.

## 📊 Project Status

<details>
<summary><strong>Current Development Progress</strong></summary>

The project is currently establishing its initial monorepo structure and development foundations.

The implementation of applications, microservices, infrastructure, and automated workflows will be carried out incrementally.

</details>

| Component | Status |
|---|---|
| Repository initialization | In progress |
| Monorepo structure | In progress |
| Backend microservices | Planned |
| Web application | Planned |
| Mobile application | Planned |
| Desktop application | Planned |
| Cloud infrastructure | Planned |
| CI/CD automation | Planned |
| Testing strategy | Planned |

## 🎓 Academic Context

FarmaLink is developed as an academic software engineering project focused on designing and implementing a multiplatform solution for pharmacy benefit management and corporate agreements.

The project applies software architecture, cloud infrastructure, automation, testing, and collaborative development practices.

---

<p align="center">
  <strong>FarmaLink</strong>
  <br/>
  <em>Connecting organizations. Simplifying benefits. Empowering people.</em>
  <br/><br/>
  © 2026 FarmaLink — Academic Software Engineering Project.
</p>