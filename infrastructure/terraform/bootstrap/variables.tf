variable "aws_region" {
  description = "AWS region for the Terraform state bucket."
  type        = string
  default     = "us-east-1"
}

variable "aws_account_id" {
  description = "Expected AWS Academy account ID."
  type        = string
  default     = "835300723685"
}

variable "state_bucket_name" {
  description = "Globally unique S3 bucket name for Terraform state."
  type        = string
  default     = "farmalink-tfstate-835300723685-us-east-1"
}