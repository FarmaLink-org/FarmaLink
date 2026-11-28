output "state_bucket_name" {
  description = "Name of the Terraform remote state bucket."
  value       = aws_s3_bucket.terraform_state.id
}

output "state_bucket_arn" {
  description = "ARN of the Terraform remote state bucket."
  value       = aws_s3_bucket.terraform_state.arn
}

output "state_bucket_region" {
  description = "AWS region of the state bucket."
  value       = var.aws_region
}

output "versioning_status" {
  description = "Versioning configuration."
  value       = aws_s3_bucket_versioning.terraform_state.versioning_configuration[0].status
}