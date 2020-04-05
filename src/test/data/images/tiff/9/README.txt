This folder contains sample TIFF images that provide floating-point data formats.

USGS_13_n38w077_dir5.tiff -------------------------------------------
   Samples Per Pixel:  1
   Bits Per Pixel:    32 (IEEE-754 standard single-precision)
   Predictor:          3  (floating-point specific)
   
The US Geologic Survey (USGS) provides terrestrial elevation data in the form of TIFF images with metadata tags
suitable to Geographic Information System (GIS) applications.  TIFF files that provide these standard
metadata tags are known as GeoTIFF files.

The original USGS_13_n32w077.tif file was issued as part of the USGS 3D Elevation Program (3DEP)
and provided data with a point spacing of 1/3rd second of arc, or about 10.3 meters spacing between
elevation samples.  The original product features 1 main image and 5 down-sampled images.  To keep the size
of the Apache Commons Imaging download small, only the smalles down-sampled image was included.

The down-sampled image includes the following TIFF fields:

 256 (0x100: ImageWidth): 338 (1 Short)
 257 (0x101: ImageLength): 338 (1 Short)
 258 (0x102: BitsPerSample): 32 (1 Short)
 259 (0x103: Compression): 5 (1 Short)
 262 (0x106: PhotometricInterpretation): 1 (1 Short)
 277 (0x115: SamplesPerPixel): 1 (1 Short)
 284 (0x11c: PlanarConfiguration): 1 (1 Short)
 317 (0x13d: Predictor): 3 (1 Short)
 322 (0x142: TileWidth): 128 (1 Short)
 323 (0x143: TileLength): 128 (1 Short)
 324 (0x144: TileOffsets): [9 entries]
 325 (0x145: TileByteCounts): [9 entries]
 339 (0x153: SampleFormat): 3 (1 Short)
 42113 (0xa481: GDALNoData): '-999999' (8 ASCII)