locals {
  project_name = var.project_name

  common_tags = merge(
    {
      Project     = var.project_name
      Environment = var.environment
      ManagedBy   = "Terraform"
      Owner       = "FarmaLink"
      Application = "PharmacyBenefitsPlatform"
    },
    var.common_tags
  )

  resource_prefix = lower(
    "${var.project_name}-${var.environment}"
  )
}
