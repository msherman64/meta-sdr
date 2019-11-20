SUMMARY = "This is a OOTM to help with simple debugging with the PMT messages."
HOMEPAGE = "https://github.com/gr-vt/gr-message_tools"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gnuradio swig-native"

inherit setuptools cmake

export BUILD_SYS
export HOST_SYS="${MULTIMACH_TARGET_SYS}"

FILES_SOLIBSDEV = ""
FILES_${PN} += "${datadir}/gnuradio/grc/blocks/* ${libdir}/*.so"

PV = "0.0.4+git${SRCPV}"

SRC_URI = "git://github.com/gr-vt/gr-message_tools;branch=master \
          "
S = "${WORKDIR}/git"

SRCREV = "c34b1235e6c821e88730bf9d6da9dfdf459507f6"
