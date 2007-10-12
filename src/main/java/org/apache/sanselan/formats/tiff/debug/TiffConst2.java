package org.apache.sanselan.formats.tiff.debug;

public class TiffConst2
{
	/*

	 between Exif Tags and Flashpix Property Set (1) (TIFF Tags)
	 Exif FPX
	 Tag Code Field Name
	 Dec Hex
	 Property Set Group Name
	 ImageWidth 256 100 - - -
	 ImageLength 257 101 - - -
	 BitsPerSample 258 102 - - -
	 Compression 259 103 - - -
	 PhotometricInterpretation 262 106 - - -
	 ImageDescription 270 10E Image Info Content Description Caption text
	 Make 271 10F Image Info Camera Information Camera manufacturer name
	 Model 272 110 Image Info Camera Information Camera model name
	 StripOffsets 273 111 - - -
	 Orientation 274 112 Transform - Spatial Orientation
	 SamplesPerPixel 277 115 - - -
	 RowsPerStrip 278 116 - - -
	 StripByteCounts 279 117 - - -
	 XResolution 282 11A Image Contents Primary description Default display width
	 YResolution 283 11B Image Contents Primary description Default display height
	 PlanarConfiguration 284 11C - - -
	 ResolutionUnit 296 128 Image Contents Primary description Display height/width units
	 TransferFunction 301 12D - - -
	 Software 305 131 Image Info File source Software Name
	 DateTime 306 132 Ignore Ignore Ignore
	 Artist 315 13B Image Info Intellectual Property Authorship
	 WhitePoint 318 13E - - -
	 PrimaryChromaticities 319 13F - - -
	 YCbCrCoefficients 529 211 - - -
	 YCbCrSubSampling 530 212 - - -
	 YCbCrPositioning 531 213 Ignore Ignore Ignore
	 ReferenceBlackWhite 532 214 - - -
	 Copyright 33432 8298 Image Info Intellectual Property Copyright message
	 Exif IFD Pointer 34665 8769 - - -
	 GPS Info IFD Pointer 34853 8825 - - -
	 JEITA CP-3451
	 - 129 -
	 Table 50 Conversion between Exif Tags and Flashpix Property Set (2) (Exif Private Tags)
	 Exif FPX
	 Tag Code Field Name
	 Dec Hex
	 Property Set Group Name
	 ExposureTime 33434 829A Image Info Per Picture Camera Setting Exposure time
	 FNumber 33437 829D Image Info Per Picture Camera Setting F-number
	 ExposureProgram 34850 8822 Image Info Per Picture Camera Setting Exposure program
	 SpectralSensitivity 34852 8824 Image Info Digital Camera Characterization Spectral sensitivity
	 ISOSpeedRatings 34855 8827 Image Info Digital Camera Characterization ISO speed ratings
	 OECF 34857 8829 Image Info Digital Camera Characterization OECF
	 ExifVersion 36864 9000 - - -
	 DateTimeOriginal 36867 9003 Image Info Content Description Date of the original image
	 Image Info Per Picture Camera Setting Capture date
	 DateTimeDigitized 36868 9004 Summary Info - Create date/time
	 ComponentsConfiguration 37121 9101 Ignore Ignore Ignore
	 CompressedBitsPerPixel 37122 9102 Ignore Ignore Ignore
	 ShutterSpeedValue 37377 9201 Image Info Per Picture Camera Setting Exposure time
	 ApertureValue 37378 9202 Image Info Per Picture Camera Setting F-number
	 BrightnessValue 37379 9203 Image Info Per Picture Camera Setting Brightness value
	 ExposureBiasValue 37380 9204 Image Info Per Picture Camera Setting Exposure bias value
	 MaxApertureValue 37381 9205 Image Info Per Picture Camera Setting Maximum aperture value
	 SubjectDistance 37382 9206 Image Info Per Picture Camera Setting Subject distance
	 MeteringMode 37383 9207 Image Info Per Picture Camera Setting Metering mode
	 LightSource 37384 9208 Image Info Per Picture Camera Setting Scene illuminant
	 Flash 37385 9209 Image Info Per Picture Camera Setting Flash
	 Image Info Per Picture Camera Setting Flash return
	 FocalLength 37386 920A Image Info Per Picture Camera Setting Focal length
	 MakerNote 37500 927C - - -
	 UserComment 37510 9286 Image Info Content description Content description note
	 SubSecTime 37520 9290 Ignore Ignore Ignore
	 SubSecTimeOriginal 37521 9291 Image Info Content Description Date of the original image
	 Image Info Per Picture Camera Setting Capture date
	 SubSecTimeDigitized 37522 9292 Summary Info - Create date/time
	 FlashpixVersion 40960 A000 - - -
	 ColorSpace 40961 A001 Image Contents resolution description Subimage color
	 PixelXDimension 40962 A002 Image Contents Primary description Highest resolution width
	 PixelYDimension 40963 A003 Image Contents Primary description Highest resolution height
	 RelatedSoundFile 40964 A004 - - -
	 FlashEnergy 41483 A20B Image Info Per Picture Camera Setting Flash Energy
	 SpatialFrequencyResponse 41484 A20C Image Info Digital Camera Characterization Spatial frequency response
	 FocalplaneXResolution 41486 A20E Image Info Digital Camera Characterization Focal plane X resolution
	 FocalplaneYResolution 41487 A20F Image Info Digital Camera Characterization Focal plane Y resolution
	 FocalplaneResolutionUnit 41488 A210 Image Info Digital Camera Characterization Focal plane resolution unit
	 SubjectLocation 41492 A214 Image Info Per Picture Camera Setting Subject location
	 ExposureIndex 41493 A215 Image Info Per Picture Camera Setting Exposure index
	 SensingMethod 41495 A217 Image Info Digital Camera Characterization Sensing method
	 FileSource 41728 A300 Image Info File Source File source
	 SceneType 41729 A301 Image Info File Source Scene type
	 CFAPattern 41730 A302 Image Info Digital Camera Characterization CFA pattern
	 JEITA CP-3451
	 - 130 -
	 Table 51 Conversion between Exif Tags and Flashpix Property Set (3) (GPS Info Tags)
	 Exif FPX
	 Tag Code Field Name
	 Dec Hex
	 Property Set Group Name
	 GPSVersionID 0 0 GPS Info extension - GPSVersionID
	 GPSLatitudeRef 1 1 GPS Info extension - GPSLatitudeRef
	 GPSLatitude 2 2 GPS Info extension - GPSLatitude
	 GPSLongitudeRef 3 3 GPS Info extension - GPSLongitudeRef
	 GPSLongitude 4 4 GPS Info extension - GPSLongitude
	 GPSAltitudeRef 5 5 GPS Info extension - GPSAltitudeRef
	 GPSAltitude 6 6 GPS Info extension - GPSAltitude
	 GPSTimeStamp 7 7 GPS Info extension - GPSTimeStamp
	 GPSSatellites 8 8 GPS Info extension - GPSSatellites
	 GPSStatus 9 9 GPS Info extension - GPSStatus
	 GPSMeasureMode 10 A GPS Info extension - GPSMeasureMode
	 GPSDOP 11 B GPS Info extension - GPSDOP
	 GPSSpeedRef 12 C GPS Info extension - GPSSpeedRef
	 GPSSpeed 13 D GPS Info extension - GPSSpeed
	 GPSTrackRef 14 E GPS Info extension - GPSTrackRef
	 GPSTrack 15 F GPS Info extension - GPSTrack
	 GPSImgDirectionRef 16 10 GPS Info extension - GPSImgDirectionRef
	 GPSImgDirection 17 11 GPS Info extension - GPSImgDirection
	 GPSMapDatum 18 12 GPS Info extension - GPSMapDatum
	 GPSDestLatitudeRef 19 13 GPS Info extension - GPSDestLatitudeRef
	 GPSDestLatitude 20 14 GPS Info extension - GPSDestLatitude
	 GPSDestLongitudeRef 21 15 GPS Info extension - GPSDestLongitudeRef
	 GPSDestLongitude 22 16 GPS Info extension - GPSDestLongitude
	 GPSDestBearingRef 23 17 GPS Info extension - GPSDestBearingRef
	 GPSDestBearing 24 18 GPS Info extension - GPSDestBearing
	 GPSDestDistanceRef 25 19 GPS Info extension - GPSDestDistanceRef
	 GPSDestDistance 26 1A GPS Info extension - GPSDestDistance

	 /**/

}
