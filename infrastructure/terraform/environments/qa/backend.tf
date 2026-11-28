terraform {
  backend "s3" {
    bucket       = "farmalink-tfstate-835300723685-us-east-1"
    key          = "environments/qa/terraform.tfstate"
    region       = "us-east-1"
    encrypt      = true
    use_lockfile = true
  }
}