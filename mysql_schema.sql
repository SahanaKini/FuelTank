-- MySQL schema for RoadRescue (run in your MySQL client)
CREATE DATABASE IF NOT EXISTS roadrescue_db;
USE roadrescue_db;

CREATE TABLE IF NOT EXISTS users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255) UNIQUE,
  phone VARCHAR(50),
  password VARCHAR(255),
  role VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS service_providers (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  station_name VARCHAR(255),
  incharge_name VARCHAR(255),
  phone VARCHAR(100),
  email VARCHAR(255),
  address TEXT,
  fuel_available BOOLEAN,
  tow_available BOOLEAN,
  tire_available BOOLEAN,
  charge_per_km DOUBLE
);

CREATE TABLE IF NOT EXISTS service_requests (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  user_email VARCHAR(255),
  type VARCHAR(50),
  status VARCHAR(50),
  latitude DOUBLE,
  longitude DOUBLE,
  created_at DATETIME
);
