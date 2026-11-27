# FarmaLink — Git Workflow and Contribution Standards

## 1. Purpose

This document defines the official Git workflow, branch naming conventions, commit message standards, Pull Request requirements, and code review policies for the FarmaLink project.

All contributors must follow these standards to ensure consistency, traceability, collaboration, and controlled integration across development environments.

## 2. Branch Strategy

FarmaLink uses a branch-based workflow with three permanent branches and temporary feature branches.

| Branch | Purpose |
|---|---|
| `main` | Stable and approved Production version |
| `qa` | Version under testing and validation |
| `dev` | Development integration branch |
| `feature/*` | Temporary branches for individual tasks or features |

### 2.1 Feature Branches

Every Jira task must have its own feature branch.

Naming convention:

`feature/FAR-XX-short-description`

Examples:

- `feature/FAR-11-initialize-farmalink-repo`
- `feature/FAR-12-git-workflow`
- `feature/FAR-20-user-registration`

Feature branches must be created from the latest `dev` branch.

### 2.2 Integration Flow

The official integration flow is:

`feature/* → dev → qa → main`

- Feature branches are merged into `dev` through Pull Requests.
- `dev` is promoted to `qa` through a Pull Request when a version is ready for testing.
- `qa` is promoted to `main` after successful validation and approval.
- Direct pushes to permanent branches are not allowed.

## 3. Branch Creation and Synchronization

Before creating a feature branch:

```bash
git switch dev
git pull origin dev
git switch -c feature/FAR-XX-short-description
```

To publish the feature branch:

```bash
git push -u origin feature/FAR-XX-short-description
```

Before opening a Pull Request, contributors must ensure their branch is synchronized with the target branch and that no unintended conflicts exist.

## 4. Commit Message Convention

FarmaLink follows the Conventional Commits specification.

Format:

`type(scope): FAR-XX description`

### 4.1 Allowed Types

| Type | Description |
|---|---|
| `feat` | New functionality |
| `fix` | Bug correction |
| `docs` | Documentation changes |
| `test` | Test implementation or updates |
| `refactor` | Code restructuring without behavior changes |
| `style` | Formatting or visual changes |
| `perf` | Performance improvements |
| `build` | Build system or dependency changes |
| `ci` | CI/CD configuration |
| `chore` | Maintenance and project configuration |

### 4.2 Examples

```text
feat(identity): FAR-20 implement user registration
fix(organization): FAR-25 correct organization validation
docs(architecture): FAR-30 update system architecture
test(identity): FAR-35 add authentication unit tests
ci(backend): FAR-40 configure Gradle test workflow
chore(git): FAR-12 configure repository workflow
```

Commit messages must be concise, descriptive, and related to a Jira task whenever applicable.

## 5. Pull Request Standards

All changes must be submitted through Pull Requests.

### 5.1 Pull Request Naming

Format:

`[FAR-XX] Short and descriptive title`

Example:

`[FAR-12] Configure Git Workflow and Pull Request Rules`

### 5.2 Pull Request Requirements

Every Pull Request must:

- Reference its related Jira issue.
- Explain the purpose and scope of the change.
- Identify affected applications, services, or infrastructure.
- Describe how the changes were tested.
- Include evidence when applicable.
- Identify relevant risks and breaking changes.
- Complete the repository Pull Request checklist.
- Pass the required automated checks before merging.

The official template is:

`.github/PULL_REQUEST_TEMPLATE.md`

## 6. Pull Request Approval Policy

- Feature Pull Requests targeting `dev` require at least one approval.
- Pull Requests targeting `qa` require at least one approval.
- Pull Requests targeting `main` require approval from another engineer.
- Authors cannot approve their own Pull Requests.
- All required review conversations must be resolved before merging.
- New commits that invalidate previous approvals must be reviewed again according to repository rules.

## 7. Merge Strategy

FarmaLink uses the following merge strategies:

| Pull Request | Merge strategy |
|---|---|
| `feature/*` → `dev` | Squash and merge |
| `dev` → `qa` | Create a merge commit |
| `qa` → `main` | Create a merge commit |

This strategy keeps individual feature changes organized while preserving the promotion history between environments.

## 8. Protected Branches

The permanent branches must be protected through GitHub repository rules.

### main

- Pull Request required.
- At least one approval required.
- Required status checks must pass once CI is configured.
- Conversation resolution required.
- Force pushes disabled.
- Branch deletion restricted.

### qa

- Pull Request required.
- At least one approval required.
- Conversation resolution required.
- Force pushes disabled.
- Branch deletion restricted.

### dev

- Pull Request required.
- At least one approval required.
- Conversation resolution required.
- Force pushes disabled.
- Branch deletion restricted.

Automated status checks will become mandatory after the corresponding GitHub Actions workflows are implemented.

## 9. Jira and GitHub Traceability

Every development task must maintain a relationship between Jira and GitHub.

The Jira issue key must appear in:

- Feature branch name.
- Commit messages.
- Pull Request title or description.

Example:

| Element | Reference |
|---|---|
| Jira issue | `FAR-12` |
| Branch | `feature/FAR-12-git-workflow` |
| Commit | `chore(git): FAR-12 configure repository workflow` |
| Pull Request | `[FAR-12] Configure Git Workflow and Pull Request Rules` |

The Jira issue must include the related GitHub branch and Pull Request links when available.

## 10. Development and Release Rules

- Do not commit directly to `main`, `qa`, or `dev`.
- Do not force-push to permanent branches.
- Do not commit secrets, credentials, private keys, or environment files.
- Keep commits focused and descriptive.
- Update documentation when architectural or operational changes are introduced.
- Execute the relevant tests before requesting review.
- Do not promote unvalidated changes to Production.
- Keep QA and Production promotion traceable through Pull Requests.

## 11. Definition of Done for Pull Requests

A Pull Request can be merged only when:

1. The implementation satisfies the related Jira acceptance criteria.
2. The required review approval is obtained.
3. Automated checks pass, when configured.
4. Relevant tests have been executed.
5. No unresolved review conversations remain.
6. Documentation is updated when necessary.
7. No sensitive information is included.
8. The changes are ready for the target branch.

## 12. Governance

These standards apply to all FarmaLink contributors and components, including backend microservices, web, mobile, desktop, infrastructure, automation, and testing.

Any modification to this workflow must be documented and reviewed by the project team.