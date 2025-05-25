-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Bulan Mei 2025 pada 10.23
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movie_db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `movie_db`
--

CREATE TABLE `movie_db` (
  `id_movie` int(100) NOT NULL,
  `Judul` varchar(100) NOT NULL,
  `Alur` double NOT NULL,
  `Penokohan` double NOT NULL,
  `Akting` double NOT NULL,
  `Rating` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `movie_db`
--

INSERT INTO `movie_db` (`id_movie`, `Judul`, `Alur`, `Penokohan`, `Akting`, `Rating`) VALUES
(2, 'mono', 5, 4, 3, 4),
(3, 'halo', 4, 5, 4, 4.333333333333333),
(4, 'apa', 2, 2, 3, 2.3333333333333335);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `movie_db`
--
ALTER TABLE `movie_db`
  ADD PRIMARY KEY (`id_movie`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `movie_db`
--
ALTER TABLE `movie_db`
  MODIFY `id_movie` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
