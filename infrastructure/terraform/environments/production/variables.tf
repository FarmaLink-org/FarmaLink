variable "project_name" {
  description = "Name of the FarmaLink project."
  type        = string
  default     = "FarmaLink"
}

variable "environment" {
  description = "Deployment environment."
  type        = string

  validation {
    condition     = contains(["qa", "production"], var.environment)
    error_message = "Environment must be qa or production."
  }
}

variable "aws_region" {
  description = "AWS region where resources will be deployed."
  type        = string
  default     = "us-east-1"
}

variable "aws_account_id" {
  description = "Expected AWS Academy account ID."
  type        = string
  default     = "835300723685"

  validation {
    condition     = can(regex("^[0-9]{12}$", var.aws_account_id))
    error_message = "AWS account ID must contain exactly 12 digits."
  }
}

variable "common_tags" {
  description = "Additional tags applied to AWS resources."
  type        = map(string)
  default     = {}
}
