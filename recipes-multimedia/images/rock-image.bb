# Copyright (C) 2017 Jacob Chen <jacob-chen@iotwrt.com>
# Released under the MIT license (see COPYING.MIT for the terms)

IMAGE_FEATURES += "\
	splash	\
"

require recipes-rk/images/rk-image-multimedia.bb

IMAGE_INSTALL += " \
	ffmpeg \
	mpv \
	packagegroup-fonts-truetype \
"
