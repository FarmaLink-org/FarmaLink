output "project_name" {
  description = "FarmaLink project name."
  value       = local.project_name
}

output "environment" {
  description = "Current Terraform environment."
  value       = var.environment
}

output "aws_region" {
  description = "Configured AWS region."
  value       = var.aws_region
}

output "aws_account_id" {
  description = "Expected AWS account ID."
  value       = var.aws_account_id
}

output "resource_prefix" {
  description = "Naming prefix for environment resources."
  value       = local.resource_prefix
}

output "common_tags" {
  description = "Common resource tags."
  value       = local.common_tags
}
