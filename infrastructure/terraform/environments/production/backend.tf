terraform {
  backend "s3" {
    bucket       = "farmalink-tfstate-835300723685-us-east-1"
    key          = "environments/production/terraform.tfstate"
    region       = "us-east-1"
    encrypt      = true
    use_lockfile = true
  }
}